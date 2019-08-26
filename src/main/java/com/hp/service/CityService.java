package com.hp.service;

import java.util.List;

import com.hp.bean.City;

public interface CityService {
	
	//查询省份
	List<City> queryAllProvince();

	//查询城市
	List<City> queryAllCity(City city);
	
	//查询县（区）
	List<City> queryAllArea(City city);

}
