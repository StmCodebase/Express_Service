package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Station;
import com.hp.dao.StationDao;
import com.hp.dao.StationMapper;
import com.hp.service.StationService;

@Service
public class StationServiceImpl implements StationService{

	@Autowired
	public StationMapper stationMapper;
	
	@Autowired
	public StationDao stationDao;
	
	
	public List<Station> queryAllStations(){
		return stationDao.queryAllStations();
	}


	public List<Station> queryStationsByExample(String search) {
		// TODO Auto-generated method stub
		return stationDao.queryStationsByExample(search);
	}


	public int deleteByPrimaryKey(Integer staNo) {
		// TODO Auto-generated method stub
		return stationMapper.deleteByPrimaryKey(staNo);
	}


	public Station queryAllStationsBystaNo(Integer staNo) {
		// TODO Auto-generated method stub
		return stationDao.queryAllStationsBystaNo(staNo);
	}


	public int insertSelective(Station record) {
		// TODO Auto-generated method stub
		return stationMapper.insertSelective(record);
	}


	public int updateByPrimaryKeySelective(Station record) {
		// TODO Auto-generated method stub
		return stationMapper.updateByPrimaryKeySelective(record);
	}
}
