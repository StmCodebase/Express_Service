package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Stock;
import com.hp.dao.StockDao;
import com.hp.dao.StockMapper;
import com.hp.service.StockSservice;

@Service
public class StockServicelmpl implements StockSservice{

	@Autowired
	public StockDao stockDao;
	
	@Autowired
	public StockMapper stockMapper;
	
	public List<Stock> queryAllStocks() {
		// TODO Auto-generated method stub
		return stockDao.queryAllStocks();
	}

	public List<Stock> queryStocksByExample(String search) {
		// TODO Auto-generated method stub
		return stockDao.queryStocksByExample(search);
	}

	public int deleteByPrimaryKey(Integer stockNum) {
		// TODO Auto-generated method stub
		return stockMapper.deleteByPrimaryKey(stockNum);
	}

	public Stock queryAllStocksBycourierNo(Integer stockNum) {
		// TODO Auto-generated method stub
		return stockDao.queryAllStocksBycourierNo(stockNum);
	}

	public int insertSelective(Stock record) {
		// TODO Auto-generated method stub
		return stockMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Stock record) {
		// TODO Auto-generated method stub
		return stockMapper.updateByPrimaryKeySelective(record);
	}

	public Stock queryAllStocksByStockNum(Stock stock) {
		// TODO Auto-generated method stub
		return stockDao.queryAllStocksByStockNum(stock);
	}

}
