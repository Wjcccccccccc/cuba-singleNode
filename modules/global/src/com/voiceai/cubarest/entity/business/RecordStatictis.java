package com.voiceai.cubarest.entity.business;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import java.util.UUID;

@MetaClass(name = "cubarest_RecordStatictis")
public class RecordStatictis extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 2772944989372227975L;
    @MetaProperty
    protected UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @MetaProperty
    private Integer male;

    @MetaProperty
    private Integer female;

    public RecordStatictis(Integer male, Integer female) {
        this.male = male;
        this.female = female;
    }

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public Integer getFemale() {
        return female;
    }

    public void setFemale(Integer female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "RecordStatictis{" +
                "male=" + male +
                ", female=" + female +
                '}';
    }
}