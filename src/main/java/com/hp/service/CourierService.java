package com.hp.service;

import java.util.List;

import com.hp.bean.Courier;


public interface CourierService {
	
	//查询全部快递员
	List<Courier> queryAllCouriers();

	//模糊查询
	List<Courier> queryCouriersByExample(String search);
	
	//删除
	 int deleteByPrimaryKey(Integer courierNo);
	 
	 //编号查询
	 Courier queryAllCouriersBycourierNo(Integer courierNo);
	 
	 //插入
	 int insertSelective(Courier record);
	 
	 //更新
	 int updateByPrimaryKeySelective(Courier record);
}
