package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s|id")
@Table(name = "tbl_call_content")
@Entity(name = "cubarest_TblCallContent")
public class TblCallContent extends BaseIntegerIdEntity implements Creatable {
    private static final long serialVersionUID = 3816636302435839348L;


    @Column(name = "answer")
    protected String answer;

    @Column(name = "speaker_type", length = 10)
    protected String speakerType;

    @Column(name = "call_id")
    protected String call;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "record_id", referencedColumnName = "id")
    protected TblCallRecords record;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flow_id", referencedColumnName = "id")
    protected TblFlow flow;

    @Column(name = "serial_number")
    protected Integer serialNumber;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

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

    public TblCallRecords getRecord() {
        return record;
    }

    public void setRecord(TblCallRecords record) {
        this.record = record;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TblFlow getFlow() {
        return flow;
    }

    public void setFlow(TblFlow flow) {
        this.flow = flow;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}