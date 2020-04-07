package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@NamePattern("%s %s %s %s %s %s|id,startTime,endTime,topic,speaker,version")
@Table(name = "MY_SESSION")
@Entity(name = "cubarest_Session")
public class Session extends StandardEntity {
    private static final long serialVersionUID = -5767425408675058086L;

    @NotNull
    @Column(name = "TOPIC", nullable = false)
    protected String topic;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "START_TIME", nullable = false)
    protected Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_TIME")
    protected Date endTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPEAKER_ID")
    protected Speaker speaker;

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }



    @PrePersist
    @PreUpdate
    public void updateEndTime() {
        endTime = calculatedEndTime(startTime);
    }

    public static Date calculatedEndTime(Date startTime) {
        return Date.from(startTime.toInstant().plus(1, ChronoUnit.HOURS));
    }

    @Override
    public String toString() {
        return "Session{" +
                "topic='" + topic + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", speaker=" + speaker +
                '}';
    }
}