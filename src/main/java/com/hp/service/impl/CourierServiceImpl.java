package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Courier;
import com.hp.dao.CourierDao;
import com.hp.dao.CourierMapper;
import com.hp.service.CourierService;

@Service
public class CourierServiceImpl implements CourierService {

	@Autowired
	public CourierDao courierDao;
	
	@Autowired
	public CourierMapper courierMapper;
	
	
	public List<Courier> queryAllCouriers() {
		return courierDao.queryAllCouriers();
	}


	public List<Courier> queryCouriersByExample(String search) {
		return courierDao.queryCouriersByExample(search);
	}


	public int deleteByPrimaryKey(Integer courierNo) {
		// TODO Auto-generated method stub
		return courierMapper.deleteByPrimaryKey(courierNo);
	}


	public Courier queryAllCouriersBycourierNo(Integer courierNo) {
		// TODO Auto-generated method stub
		return courierDao.queryAllCouriersBycourierNo(courierNo);
	}


	public int insertSelective(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.insertSelective(record);
	}


	public int updateByPrimaryKeySelective(Courier record) {
		// TODO Auto-generated method stub
		return courierMapper.updateByPrimaryKeySelective(record);
	}
	
}
