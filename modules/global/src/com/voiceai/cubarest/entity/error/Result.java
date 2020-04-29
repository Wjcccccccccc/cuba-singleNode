package com.voiceai.cubarest.entity.error;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Transient;

@NamePattern("%s %s|code,msg")
@MetaClass(name = "cubarest_Result")
public class Result extends EmbeddableEntity {
    private static final long serialVersionUID = -2047236579902525607L;

    @Transient
    @MetaProperty
    private Integer code;

    @Transient
    @MetaProperty
    private String msg;

    public Result() {
    }

    public static Result from(Error error) {
        return new Result(error.getId(), error.getMsg());
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}