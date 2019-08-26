package com.hp.bean;

import java.util.Date;

public class Access_records {
    private Integer accNo;

    private Integer poNo;

    private Integer stockNum;

    private Integer uNo;

    private String stockStateNo;

    private Date accStartTime;

    private Date accEndTime;
    
    private String strIn;
    
    private String strOut;
    
    private Post post;

    public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getStrIn() {
		return strIn;
	}

	public void setStrIn(String strIn) {
		this.strIn = strIn;
	}

	public String getStrOut() {
		return strOut;
	}

	public void setStrOut(String strOut) {
		this.strOut = strOut;
	}

	public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public Integer getPoNo() {
        return poNo;
    }

    public void setPoNo(Integer poNo) {
        this.poNo = poNo;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getuNo() {
        return uNo;
    }

    public void setuNo(Integer uNo) {
        this.uNo = uNo;
    }

    public String getStockStateNo() {
        return stockStateNo;
    }

    public void setStockStateNo(String stockStateNo) {
        this.stockStateNo = stockStateNo == null ? null : stockStateNo.trim();
    }

    public Date getAccStartTime() {
        return accStartTime;
    }

    public void setAccStartTime(Date accStartTime) {
        this.accStartTime = accStartTime;
    }

    public Date getAccEndTime() {
        return accEndTime;
    }

    public void setAccEndTime(Date accEndTime) {
        this.accEndTime = accEndTime;
    }
}