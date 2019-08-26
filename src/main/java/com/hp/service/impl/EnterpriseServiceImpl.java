package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Enterprise;
import com.hp.dao.EnterpriseDao;
import com.hp.dao.EnterpriseMapper;
import com.hp.service.EnterpriseService;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

	@Autowired
	public EnterpriseDao enterpriseDao;
	
	@Autowired
	public EnterpriseMapper enterpriseMapper;
	
	
	public List<Enterprise> queryAllEnterprises() {
		return enterpriseDao.queryAllEnterprises();
	}


	public List<Enterprise> queryEnterprisesByExample(String search) {
		// TODO Auto-generated method stub
		return enterpriseDao.queryEnterprisesByExample(search);
	}


	public int deleteByPrimaryKey(Integer entNo) {
		// TODO Auto-generated method stub
		return enterpriseMapper.deleteByPrimaryKey(entNo);
	}


	public Enterprise queryAllEnterprisesByentNo(Integer entNo) {
		// TODO Auto-generated method stub
		return enterpriseDao.queryAllEnterprisesByentNo(entNo);
	}


	public int insertSelective(Enterprise record) {
		// TODO Auto-generated method stub
		return enterpriseMapper.insertSelective(record);
	}


	public int updateByPrimaryKeySelective(Enterprise record) {
		// TODO Auto-generated method stub
		return enterpriseMapper.updateByPrimaryKeySelective(record);
	}

}
