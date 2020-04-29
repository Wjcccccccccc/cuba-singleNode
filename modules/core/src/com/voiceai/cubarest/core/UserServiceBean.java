package com.voiceai.cubarest.core;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.core.global.PasswordEncryption;
import com.voiceai.cubarest.entity.ExtUser;
import com.voiceai.cubarest.entity.error.Error;
import com.voiceai.cubarest.entity.error.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service(UserService.NAME)
public class UserServiceBean implements UserService {
    @Inject
    protected PasswordEncryption passwordEncryption;

    @Inject
    DataManager dataManager;

    @Override
    public Object createUser(ExtUser user) {
        String login = user.getLogin();
        if (isNotExists(login)) {
            String password = user.getPassword();
            if (StringUtils.isNotEmpty(password)) {
                String passwordHash = passwordEncryption.getPasswordHash(user.getId(), password);
                user.setPassword(passwordHash);
            }
            return dataManager.commit(user, "User_base");
        }
        return Result.from(Error.User_exists);
    }

    private boolean isNotExists(String login) {
        LoadContext<ExtUser> context = LoadContext
                .create(ExtUser.class)
                .setQuery(LoadContext
                        .createQuery("from cubarest_ExtUser e where e.login = :login")
                        .setParameter("login", login));

        return dataManager.getCount(context) == 0;

/*        return dataManager.load(ExtUser.class)
                .query("from cubarest_ExtUser e where e.login = :login")
                .parameter("login", login)
                .list()
                .size() != 0;*/
    }

}