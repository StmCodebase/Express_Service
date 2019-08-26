package com.hp.bean;

public class Courier {
    private Integer courierNo;

    private Integer staNo;

    private String courierName;

    private String courierPhone;

    private String courierSex;

    private String courierEmail;

    private String courierNum;

    public Integer getCourierNo() {
        return courierNo;
    }

    public void setCourierNo(Integer courierNo) {
        this.courierNo = courierNo;
    }

    public Integer getStaNo() {
        return staNo;
    }

    public void setStaNo(Integer staNo) {
        this.staNo = staNo;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName == null ? null : courierName.trim();
    }

    public String getCourierPhone() {
        return courierPhone;
    }

    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone == null ? null : courierPhone.trim();
    }

    public String getCourierSex() {
        return courierSex;
    }

    public void setCourierSex(String courierSex) {
        this.courierSex = courierSex == null ? null : courierSex.trim();
    }

    public String getCourierEmail() {
        return courierEmail;
    }

    public void setCourierEmail(String courierEmail) {
        this.courierEmail = courierEmail == null ? null : courierEmail.trim();
    }

    public String getCourierNum() {
        return courierNum;
    }

    public void setCourierNum(String courierNum) {
        this.courierNum = courierNum == null ? null : courierNum.trim();
    }
}