package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.City;

public interface CityDao {

	@Select("SELECT DISTINCT C_PROVINCE from e_city ")
	List<City> queryAllProvince();

	@Select("SELECT DISTINCT C_CITY from e_city where C_PROVINCE = #{cProvince}")
	List<City> queryAllCity(City city);
	
	@Select("SELECT CNO,C_AREA from e_city where C_CITY = #{cCity}")
	List<City> queryAllArea(City city);
}
