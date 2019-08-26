package com.hp.service;

import java.util.List;

import com.hp.bean.Access_records;


public interface Access_recordsService {
	//查询出库
	List<Access_records> queryAllAccess_records();
	
	//出库
	int updateByPrimaryKeySelective(Access_records record);

	//查询入库
	List<Access_records> queryAllInAccess_records();
	
	//入库
	int insertSelective(Access_records record);
	
	//主键查询
	Access_records selectByPrimaryKey(Integer accNo);
	
	List<Access_records> queryAccessrecordsByPono(Access_records access_records);
}
