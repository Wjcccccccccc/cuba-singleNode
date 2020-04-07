package com.voiceai.cubarest.core;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.DataManager;
import com.voiceai.cubarest.entity.ListComingSessions;
import com.voiceai.cubarest.entity.Session;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@Service(SessionService.NAME)
public class SessionServiceBean implements SessionService {

    @Inject
    private Logger log;

    @Inject
    DataManager dataManager;

    @Inject
    Persistence persistence;


    @Override
    public boolean rechedulerSession(Session session, Date newDate) {
        Date now = new Date();
        List<Session> list = dataManager.load(Session.class)
                .query("select vo from cubarest_Session vo " +
                        "where vo.startTime > :now")
                .parameter("now" , now)
                .list();
        list.forEach(vo -> log.warn(vo.toString()));

        if (list.size() == 0 || newDate.before(now)) {
            return false;
        }

        session.setStartTime(newDate);
        session.setEndTime(Session.calculatedEndTime(newDate));
        dataManager.commit(session);
        log.warn("session 已更新:{}", session.toString());
        return true;
    }


    @Override
    public List<ListComingSessions> listComingSessions() {


        return null;
    }

}