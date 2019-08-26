package com.hp.bean;

import java.util.Date;


public class Enterprise {
    private Integer entNo;

    private String entName;

    private String entAddress;

    private String entPerson;

    private String entPhone;

    private String entEmail;

    private Date entDate;

    public Integer getEntNo() {
        return entNo;
    }

    public void setEntNo(Integer entNo) {
        this.entNo = entNo;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    public String getEntAddress() {
        return entAddress;
    }

    public void setEntAddress(String entAddress) {
        this.entAddress = entAddress == null ? null : entAddress.trim();
    }

    public String getEntPerson() {
        return entPerson;
    }

    public void setEntPerson(String entPerson) {
        this.entPerson = entPerson == null ? null : entPerson.trim();
    }

    public String getEntPhone() {
        return entPhone;
    }

    public void setEntPhone(String entPhone) {
        this.entPhone = entPhone == null ? null : entPhone.trim();
    }

    public String getEntEmail() {
        return entEmail;
    }

    public void setEntEmail(String entEmail) {
        this.entEmail = entEmail == null ? null : entEmail.trim();
    }

 
//    @DateTimeFormat(pattern="yyyy-MM-dd") 
    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }
}