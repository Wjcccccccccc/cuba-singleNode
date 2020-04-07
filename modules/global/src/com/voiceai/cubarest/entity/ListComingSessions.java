package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;

import java.util.Date;

@NamePattern("%s %s %s|startTime,topic")
@MetaClass(name = "cubarest_ListComingSessions")
public class ListComingSessions extends BaseUuidEntity {
    private static final long serialVersionUID = -6279944315109363281L;

    @MetaProperty
    protected Date startTime;

    @MetaProperty
    protected String topic;

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

}