package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Access_records;
import com.hp.dao.Access_recordsDao;
import com.hp.dao.Access_recordsMapper;
import com.hp.service.Access_recordsService;


@Service
public class Access_recordsServiceImpl implements Access_recordsService{
	
	@Autowired
	public Access_recordsDao access_recordsDao;
	
	@Autowired
	public Access_recordsMapper access_recordsMapper;

	public List<Access_records> queryAllAccess_records() {
		// TODO Auto-generated method stub
		return access_recordsDao.queryAllAccess_records();
	}

	public int updateByPrimaryKeySelective(Access_records record) {
		// TODO Auto-generated method stub
		return access_recordsMapper.updateByPrimaryKeySelective(record);
	}

	public List<Access_records> queryAllInAccess_records() {
		// TODO Auto-generated method stub
		return access_recordsDao.queryAllInAccess_records();
	}

	public int insertSelective(Access_records record) {
		// TODO Auto-generated method stub
		return access_recordsMapper.insertSelective(record);
	}

	public Access_records selectByPrimaryKey(Integer accNo) {
		// TODO Auto-generated method stub
		return access_recordsMapper.selectByPrimaryKey(accNo);
	}

	public List<Access_records> queryAccessrecordsByPono(Access_records access_records) {
		// TODO Auto-generated method stub
		return access_recordsDao.queryAccessrecordsByPono(access_records);
	}
	
	
	
	
}
