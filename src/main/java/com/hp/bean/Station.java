package com.hp.bean;

public class Station {
    private Integer staNo;

    private Integer cno;

    private String staName;

    private String staAddress;

    private String staPerson;

    private String staPhone;

    public Integer getStaNo() {
        return staNo;
    }

    public void setStaNo(Integer staNo) {
        this.staNo = staNo;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName == null ? null : staName.trim();
    }

    public String getStaAddress() {
        return staAddress;
    }

    public void setStaAddress(String staAddress) {
        this.staAddress = staAddress == null ? null : staAddress.trim();
    }

    public String getStaPerson() {
        return staPerson;
    }

    public void setStaPerson(String staPerson) {
        this.staPerson = staPerson == null ? null : staPerson.trim();
    }

    public String getStaPhone() {
        return staPhone;
    }

    public void setStaPhone(String staPhone) {
        this.staPhone = staPhone == null ? null : staPhone.trim();
    }
}