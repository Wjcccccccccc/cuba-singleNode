package com.voiceai.cubarest.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "cubarest_ExtUser")
@Extends(User.class)
public class ExtUser extends User {
    private static final long serialVersionUID = 2675057304718609942L;

    @Length(message = "{msg://cubarest_ExtUser.address.validation.Length}", max = 64)
    @Column(name = "ADDRESS")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}