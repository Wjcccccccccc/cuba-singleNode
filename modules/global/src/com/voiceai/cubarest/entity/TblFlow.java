package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s|name,id")
@Table(name = "tbl_flow")
@Entity(name = "cubarest_TblFlow")
public class TblFlow extends BaseIntIdentityIdEntity implements Creatable {
    private static final long serialVersionUID = -42177746436575582L;

    @Column(name = "name")
    protected String name;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}