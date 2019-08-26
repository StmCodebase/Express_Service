package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.bean.City;
import com.hp.dao.CityDao;
import com.hp.service.CityService;

@Controller
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	public CityDao cityDao;
	
	@Autowired
	public CityService cityService;
	
	@RequestMapping("/provice")
	@ResponseBody
	public List<City> provice(){
	
		List<City> clist = cityService.queryAllProvince();

		
		return clist;
	}
	
	@RequestMapping("/city2")
	@ResponseBody
	public List<City> city(City city){
	
		
		List<City> clist = cityService.queryAllCity(city);

		
		return clist;
	}
	
	@RequestMapping("/area")
	@ResponseBody
	public List<City> area(HttpSession session,City city){

		
		List<City> clist = cityService.queryAllArea(city);
	
		
		return clist;
	}
}
