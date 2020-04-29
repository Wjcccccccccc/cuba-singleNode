package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.core.entity.annotation.SystemLevel;
import com.haulmont.cuba.security.entity.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@NamePattern("%s %s %s %s|login,phone,active,remark")
@Entity(name = "cubarest_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = 2675057304718609942L;

    @Column(name = "LOGIN", length = 20, nullable = false)
    @Pattern(regexp = "[A-Za-z0-9]{8,16}" ,message = "{msg://cubarest_ExtUser.login.validation.pattern}")
    protected String login;

    @SystemLevel
    @Column(name = "PASSWORD", length = 20 ,nullable = false)
    @Pattern(regexp = "[A-Za-z]{8,16}" ,message = "{msg://cubarest_ExtUser.password.validation.pattern}")
    protected String password;

    @Pattern(regexp = "[0-9]{11}" ,message = "{msg://cubarest_ExtUser.phone.validation.pattern}")
    @Column(name = "PHONE")
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMP_ID", referencedColumnName = "id")
    private TblCompany comp_id;

    @Column(name = "REMARK")
    @Length(max = 100 ,message = "{msg://cubarest_ExtUser.ramark.validation.Length}")
    private String remark;

    public String getPhone() {
        return phone;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TblCompany getComp_id() {
        return comp_id;
    }

    public void setComp_id(TblCompany comp_id) {
        this.comp_id = comp_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}