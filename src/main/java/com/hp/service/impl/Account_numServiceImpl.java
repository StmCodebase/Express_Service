package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Account_num;
import com.hp.dao.Account_numDao;
import com.hp.dao.Account_numMapper;
import com.hp.service.Account_numService;

@Service
public class Account_numServiceImpl implements Account_numService {

	@Autowired
	public Account_numMapper account_numMapper;
	
	@Autowired
	public Account_numDao account_numDao;

	public int insertSelective(Account_num record) {
		// TODO Auto-generated method stub
		return account_numMapper.insertSelective(record);
	}

	public List<Account_num> queryAllAccNum() {
		// TODO Auto-generated method stub
		return account_numDao.queryAllAccNum();
	}

	public Account_num queryAccount_numsByAccount_num(Account_num account_num) {
		// TODO Auto-generated method stub
		return account_numDao.queryAccount_numsByAccount_num(account_num);
	}

	
	
	
	
}
