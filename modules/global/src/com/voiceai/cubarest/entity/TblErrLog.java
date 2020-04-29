package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@NamePattern("%s %s|call,errStr")
@Table(name = "tbl_err_log")
@Entity(name = "cubarest_TblErrLog")
public class TblErrLog extends BaseStringIdEntity implements Creatable {
    private static final long serialVersionUID = -2795971963734064793L;

    @Id
    @Column(name = "call_id", nullable = false)
    protected String call;

    @Column(name = "err_str")
    protected String errStr;

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

    public String getErrStr() {
        return errStr;
    }

    public void setErrStr(String errStr) {
        this.errStr = errStr;
    }

    @Override
    public void setId(String id) {
        this.call = id;
    }

    @Override
    public String getId() {
        return call;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}