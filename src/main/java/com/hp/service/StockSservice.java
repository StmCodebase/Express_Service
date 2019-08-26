package com.hp.service;

import java.util.List;

import com.hp.bean.Stock;



public interface StockSservice {

	//查询全部仓库
		List<Stock> queryAllStocks();

		//模糊查询
		List<Stock> queryStocksByExample(String search);
		
		//删除
		 int deleteByPrimaryKey(Integer stockNum);
		 
		 //编号查询
		 Stock queryAllStocksBycourierNo(Integer stockNum);
		 
		 //插入
		 int insertSelective(Stock record);
		 
		 //更新
		 int updateByPrimaryKeySelective(Stock record);
		 
			
			Stock queryAllStocksByStockNum(Stock stock);
}
