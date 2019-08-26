package com.hp.bean;

public class Group {
    private Integer gNo;

    private String gName;

    private Integer roNo;

    public Integer getgNo() {
        return gNo;
    }

    public void setgNo(Integer gNo) {
        this.gNo = gNo;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getRoNo() {
        return roNo;
    }

    public void setRoNo(Integer roNo) {
        this.roNo = roNo;
    }
}