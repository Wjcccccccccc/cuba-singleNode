package com.voiceai.cubarest.entity.business;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

import java.util.Date;

@NamePattern("%s %s %s|startTime,topic")
@MetaClass(name = "cubarest_ListComingSessions")
public class ListComingSessions extends BaseUuidEntity {
    private static final long serialVersionUID = -6279944315109363281L;

    @MetaProperty
    protected Date startTime;

    @MetaProperty
    protected String own;

    @MetaProperty
    protected String topic;

    public ListComingSessions(Date startTime, String own, String topic) {
        this.startTime = startTime;
        this.own = own;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

}