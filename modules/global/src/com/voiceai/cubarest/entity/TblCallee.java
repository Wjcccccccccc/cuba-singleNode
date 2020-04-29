package com.voiceai.cubarest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import java.util.Date;

@DesignSupport("{'imported':true}")
@NamePattern("%s|id")
@Table(name = "tbl_callee")
@Entity(name = "cubarest_TblCallee")
public class TblCallee extends BaseStringIdEntity implements Creatable {
    private static final long serialVersionUID = -7475107377973114570L;

    @Id
    @Column(name = "id", nullable = false)
    protected String id;

    @Column(name = "city")
    protected String city;

    @Column(name = "client_name")
    protected String clientName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comp_id", referencedColumnName = "id")
    protected TblCompany comp;

    @Column(name = "filepath", nullable = false)
    protected String filepath;

    @Column(name = "gender")
    protected Integer gender;

    @Column(name = "name")
    protected String name;

    @Column(name = "phone_num")
    protected String phoneNum;

    @Column(name = "province")
    protected String province;

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

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public TblCompany getComp() {
        return comp;
    }

    public void setComp(TblCompany comp) {
        this.comp = comp;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}