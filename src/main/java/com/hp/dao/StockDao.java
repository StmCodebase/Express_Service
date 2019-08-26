package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Stock;

public interface StockDao {

	//查询全部仓库
	@Select("select * from e_stock")
	List<Stock> queryAllStocks();

	//模糊查询
	List<Stock> queryStocksByExample(String search);
			
			
			 
	//编号查询
	@Select("select * from e_stock where STOCK_NUM = #{stockNum}")
	Stock queryAllStocksBycourierNo(Integer stockNum);
			 
	//编号查询2
	@Select("select * from e_stock where STOCK_NUM = #{stockNum}")
	Stock queryAllStocksByStockNum(Stock stock);
}
