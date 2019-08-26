package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.City;
import com.hp.dao.CityDao;
import com.hp.service.CityService;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	public CityDao cityDao;
	
	
	public List<City> queryAllProvince() {
		// TODO Auto-generated method stub
		return cityDao.queryAllProvince();
	}


	public List<City> queryAllCity(City city) {
		// TODO Auto-generated method stub
		return cityDao.queryAllCity(city);
	}


	public List<City> queryAllArea(City city) {
		// TODO Auto-generated method stub
		return cityDao.queryAllArea(city);
	}

}
