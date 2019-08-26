package com.hp.bean;

public class Stock_state {
    private Integer stockStateNo;

    private String stockStateNews;

    public Integer getStockStateNo() {
        return stockStateNo;
    }

    public void setStockStateNo(Integer stockStateNo) {
        this.stockStateNo = stockStateNo;
    }

    public String getStockStateNews() {
        return stockStateNews;
    }

    public void setStockStateNews(String stockStateNews) {
        this.stockStateNews = stockStateNews == null ? null : stockStateNews.trim();
    }
}