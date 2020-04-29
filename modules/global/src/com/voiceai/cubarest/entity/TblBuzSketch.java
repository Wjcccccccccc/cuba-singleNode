package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s %s %s %s|id,flow,name,remark,com")
@Table(name = "tbl_buz_sketch")
@Entity(name = "cubarest_TblBuzSketch")
public class TblBuzSketch extends BaseIntegerIdEntity implements Creatable {
    private static final long serialVersionUID = -2938920897619093928L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "com_id", referencedColumnName = "id")
    protected TblCompany com;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flow_id", referencedColumnName = "id")
    protected TblFlow flow;

    @Column(name = "name")
    protected String name;

    @Column(name = "remark")
    protected String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TblFlow getFlow() {
        return flow;
    }

    public void setFlow(TblFlow flow) {
        this.flow = flow;
    }

    public TblCompany getCom() {
        return com;
    }

    public void setCom(TblCompany com) {
        this.com = com;
    }
}