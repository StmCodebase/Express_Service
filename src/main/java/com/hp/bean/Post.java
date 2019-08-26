package com.hp.bean;

import java.util.Date;

public class Post {
    private Integer poNo;

    private Integer cnoStar;

    private String poStarAddress;

    private String poSender;

    private String poSenderPhone;

    private Integer courierStar;

    private Date poStarTime;

    private String poPrice;

    private Integer cnoEnd;

    private String poEndAddress;

    private String poAddressee;

    private String poAddresseePhone;

    private Integer courierEnd;

    private Date poEndTime;

    private Float poWeight;

    private String poPay;

    private String poAppraise;
    
    private String status;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPoNo() {
        return poNo;
    }

    public void setPoNo(Integer poNo) {
        this.poNo = poNo;
    }

    public Integer getCnoStar() {
        return cnoStar;
    }

    public void setCnoStar(Integer cnoStar) {
        this.cnoStar = cnoStar;
    }

    public String getPoStarAddress() {
        return poStarAddress;
    }

    public void setPoStarAddress(String poStarAddress) {
        this.poStarAddress = poStarAddress == null ? null : poStarAddress.trim();
    }

    public String getPoSender() {
        return poSender;
    }

    public void setPoSender(String poSender) {
        this.poSender = poSender == null ? null : poSender.trim();
    }

    public String getPoSenderPhone() {
        return poSenderPhone;
    }

    public void setPoSenderPhone(String poSenderPhone) {
        this.poSenderPhone = poSenderPhone == null ? null : poSenderPhone.trim();
    }

    public Integer getCourierStar() {
        return courierStar;
    }

    public void setCourierStar(Integer courierStar) {
        this.courierStar = courierStar;
    }

    public Date getPoStarTime() {
        return poStarTime;
    }

    public void setPoStarTime(Date poStarTime) {
        this.poStarTime = poStarTime;
    }

    public String getPoPrice() {
        return poPrice;
    }

    public void setPoPrice(String poPrice) {
        this.poPrice = poPrice == null ? null : poPrice.trim();
    }

    public Integer getCnoEnd() {
        return cnoEnd;
    }

    public void setCnoEnd(Integer cnoEnd) {
        this.cnoEnd = cnoEnd;
    }

    public String getPoEndAddress() {
        return poEndAddress;
    }

    public void setPoEndAddress(String poEndAddress) {
        this.poEndAddress = poEndAddress == null ? null : poEndAddress.trim();
    }

    public String getPoAddressee() {
        return poAddressee;
    }

    public void setPoAddressee(String poAddressee) {
        this.poAddressee = poAddressee == null ? null : poAddressee.trim();
    }

    public String getPoAddresseePhone() {
        return poAddresseePhone;
    }

    public void setPoAddresseePhone(String poAddresseePhone) {
        this.poAddresseePhone = poAddresseePhone == null ? null : poAddresseePhone.trim();
    }

    public Integer getCourierEnd() {
        return courierEnd;
    }

    public void setCourierEnd(Integer courierEnd) {
        this.courierEnd = courierEnd;
    }

    public Date getPoEndTime() {
        return poEndTime;
    }

    public void setPoEndTime(Date poEndTime) {
        this.poEndTime = poEndTime;
    }

    public Float getPoWeight() {
        return poWeight;
    }

    public void setPoWeight(Float poWeight) {
        this.poWeight = poWeight;
    }

    public String getPoPay() {
        return poPay;
    }

    public void setPoPay(String poPay) {
        this.poPay = poPay == null ? null : poPay.trim();
    }

    public String getPoAppraise() {
        return poAppraise;
    }

    public void setPoAppraise(String poAppraise) {
        this.poAppraise = poAppraise == null ? null : poAppraise.trim();
    }
}