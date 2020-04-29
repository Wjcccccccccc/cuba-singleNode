package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;
import com.haulmont.cuba.core.entity.Creatable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NamePattern("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s|id,call,company,flowName,callDirect,caller,callee,caller,startTime,answerTime,durationTime,identityCheck,gender,emotion,cough")
@Table(name = "tbl_call_records")
@Entity(name = "cubarest_TblCallRecords")
public class TblCallRecords extends BaseIntIdentityIdEntity implements Creatable {
    private static final long serialVersionUID = 3213005609636662407L;

    @Column(name = "answer_time")
    protected Date answerTime;

    @Column(name = "call_id")
    protected String call;//话单id

    @Column(name = "call_direct")
    protected String callDirect;

    @Lob
    @Column(name = "call_log")
    protected String callLog;

    @Column(name = "call_result")
    protected Boolean callResult;

    @Column(name = "pass_hubei")
    protected Boolean pass_hubei;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "callee", referencedColumnName = "id")
    protected TblCallee callee;

    @Column(name = "callee_area")
    protected String calleeArea;

    @Column(name = "caller")
    protected String caller;

    @Column(name = "caller_area")
    protected String callerArea;

    @Column(name = "city")
    protected String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comp_id", referencedColumnName = "id")
    protected TblCompany comp;

    @Column(name = "company")
    protected String company;

    @Column(name = "content")
    protected String content;

    @OneToMany(mappedBy = "record")
    protected List<TblCallContent> contents;

    @Column(name = "cough")
    protected Integer cough;

    @Column(name = "health")
    protected Integer health;

    @Column(name = "duration_time")
    protected Integer durationTime;

    @Column(name = "emotion")
    protected Integer emotion;

    @Column(name = "end_time")
    protected Date endTime;

    @Column(name = "filepath")
    protected String filepath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flow_id", referencedColumnName = "id")
    protected TblFlow flow;

    @Column(name = "flow_name")
    protected String flowName;

    @Column(name = "gender")
    protected Integer gender;

    @Column(name = "identity_check")
    protected Boolean identityCheck;

    @Column(name = "province")
    protected String province;

    @Column(name = "robot_answer_time")
    protected Date robotAnswerTime;

    @Column(name = "start_time")
    protected Date startTime;

    @Column(name = "CREATE_TS")
    protected Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
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

    public void setCallee(TblCallee callee) {
        this.callee = callee;
    }

    public TblCallee getCallee() {
        return callee;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getRobotAnswerTime() {
        return robotAnswerTime;
    }

    public void setRobotAnswerTime(Date robotAnswerTime) {
        this.robotAnswerTime = robotAnswerTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Boolean getIdentityCheck() {
        return identityCheck;
    }

    public void setIdentityCheck(Boolean identityCheck) {
        this.identityCheck = identityCheck;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }



    public TblFlow getFlow() {
        return flow;
    }

    public void setFlow(TblFlow flow) {
        this.flow = flow;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getEmotion() {
        return emotion;
    }

    public void setEmotion(Integer emotion) {
        this.emotion = emotion;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }


    public List<TblCallContent> getContents() {
        return contents;
    }

    public void setContents(List<TblCallContent> contents) {
        this.contents = contents;
    }

    public Integer getCough() {
        return cough;
    }

    public void setCough(Integer cough) {
        this.cough = cough;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TblCompany getComp() {
        return comp;
    }

    public Boolean getPass_hubei() {
        return pass_hubei;
    }

    public void setPass_hubei(Boolean pass_hubei) {
        this.pass_hubei = pass_hubei;
    }

    public void setComp(TblCompany comp) {
        this.comp = comp;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCallerArea() {
        return callerArea;
    }

    public void setCallerArea(String callerArea) {
        this.callerArea = callerArea;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCalleeArea() {
        return calleeArea;
    }

    public void setCalleeArea(String calleeArea) {
        this.calleeArea = calleeArea;
    }

    public Boolean getCallResult() {
        return callResult;
    }

    public void setCallResult(Boolean callResult) {
        this.callResult = callResult;
    }

    public String getCallLog() {
        return callLog;
    }

    public void setCallLog(String callLog) {
        this.callLog = callLog;
    }

    public String getCallDirect() {
        return callDirect;
    }

    public void setCallDirect(String callDirect) {
        this.callDirect = callDirect;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }
}