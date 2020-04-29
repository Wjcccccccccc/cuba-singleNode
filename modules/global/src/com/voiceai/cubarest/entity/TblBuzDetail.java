package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.*;
import java.util.Date;

@NamePattern("%s %s %s %s %s %s %s %s %s %s|id,flow,talkType,serialNumber,requiredQuestion,keywordOk,keywordNg,displayOk,displayNg,content")
@Table(name = "tbl_buz_detail")
@Entity(name = "cubarest_TblBuzDetail")
public class TblBuzDetail extends BaseIntegerIdEntity implements Creatable {
    private static final long serialVersionUID = 3920242814689624332L;

    @Column(name = "content")
    protected String content;

    @Column(name = "display_ng")
    protected String displayNg;

    @Column(name = "display_ok")
    protected String displayOk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flow_id", referencedColumnName = "id")
    protected TblFlow flow;

    @Column(name = "keyword_ng")
    protected String keywordNg;

    @Column(name = "keyword_ok")
    protected String keywordOk;

    @Column(name = "required_question")
    protected Integer requiredQuestion;

    @Column(name = "serial_number")
    protected Integer serialNumber;

    @Column(name = "talk_type")
    protected Integer talkType;

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

    public Integer getTalkType() {
        return talkType;
    }

    public void setTalkType(Integer talkType) {
        this.talkType = talkType;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getRequiredQuestion() {
        return requiredQuestion;
    }

    public void setRequiredQuestion(Integer requiredQuestion) {
        this.requiredQuestion = requiredQuestion;
    }

    public String getKeywordOk() {
        return keywordOk;
    }

    public void setKeywordOk(String keywordOk) {
        this.keywordOk = keywordOk;
    }

    public String getKeywordNg() {
        return keywordNg;
    }

    public void setKeywordNg(String keywordNg) {
        this.keywordNg = keywordNg;
    }

    public TblFlow getFlow() {
        return flow;
    }

    public void setFlow(TblFlow flow) {
        this.flow = flow;
    }

    public String getDisplayOk() {
        return displayOk;
    }

    public void setDisplayOk(String displayOk) {
        this.displayOk = displayOk;
    }

    public String getDisplayNg() {
        return displayNg;
    }

    public void setDisplayNg(String displayNg) {
        this.displayNg = displayNg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}