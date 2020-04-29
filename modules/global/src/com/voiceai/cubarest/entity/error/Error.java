package com.voiceai.cubarest.entity.error;

import com.haulmont.chile.core.datatypes.impl.EnumClass;


public enum Error implements EnumClass<Integer> {

    Unknowed(99999 , "未知错误"),
    User_exists(10001 , "用户已存在"),


    ;

    private int id;

    private String msg;

    Error(int value, String msg) {
        this.id = value;
        this.msg = msg;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Error fromId(int id) {
        for (Error at : Error.values()) {
            if (id == at.getId()) {
                return at;
            }
        }
        return Unknowed;
    }
}