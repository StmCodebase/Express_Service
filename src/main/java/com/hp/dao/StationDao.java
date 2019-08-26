package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Station;

public interface StationDao {
	
	@Select("select * from e_station")
	List<Station> queryAllStations();

	List<Station> queryStationsByExample(String search);
	
	@Select("select * from e_station where STA_NO = #{staNo}")
	Station queryAllStationsBystaNo(Integer staNo);
}
