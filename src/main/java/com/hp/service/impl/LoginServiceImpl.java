package com.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Account_num;
import com.hp.bean.User;
import com.hp.dao.Account_numMapper;
import com.hp.dao.LoginDao;
import com.hp.dao.UserMapper;
import com.hp.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao ;
	
	@Autowired
	private Account_numMapper account_numMapper ;
	
	@Autowired
	private UserMapper userMapper;

	public Account_num queryLoginNumForAdmin(Account_num account_num) {
		// TODO Auto-generated method stub
		return loginDao.queryLoginNumForAdmin(account_num);
	}

	public User queryLoginUserForAdmin(Integer accNo) {
		// TODO Auto-generated method stub
		return loginDao.queryLoginUserForAdmin(accNo);
	}

	public Account_num queryLoginNumForUser(Account_num account_num) {
		// TODO Auto-generated method stub
		return loginDao.queryLoginNumForUser(account_num);
	}

	public int insertSelective(Account_num record) {
		// TODO Auto-generated method stub
		return account_numMapper.insertSelective(record);
	}

	public Account_num queryLoginNumForNumAndPwd(Account_num account_num) {
		// TODO Auto-generated method stub
		return loginDao.queryLoginNumForNumAndPwd(account_num);
	}

	public Integer queryGnoFromGroupForGname(String gName) {
		// TODO Auto-generated method stub
		return loginDao.queryGnoFromGroupForGname(gName);
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

}
