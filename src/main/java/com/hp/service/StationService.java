package com.hp.service;

import java.util.List;


import com.hp.bean.Station;

public interface StationService {
	
	//查询全部网点信息
	List<Station> queryAllStations();

	//模糊查询
	List<Station> queryStationsByExample(String search);
			
			//删除
	int deleteByPrimaryKey(Integer staNo);
			 
			 //编号查询
	Station queryAllStationsBystaNo(Integer staNo);
			 
			 //插入
	int insertSelective(Station record);
			 
			 //更新
	int updateByPrimaryKeySelective(Station record);
}
