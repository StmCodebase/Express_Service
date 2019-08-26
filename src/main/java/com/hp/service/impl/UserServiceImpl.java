package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.hp.dao.UserMapper;
import com.hp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserDao userDao;
	
	@Autowired
	public UserMapper userMapper;

	public List<User> queryAllUsers(){
		return userDao.queryAllUsers();
		
	}

	public List<User> queryUsersByExample(String search) {
		// TODO Auto-generated method stub
		return userDao.queryUsersByExample(search);
	}

	public int deleteByPrimaryKey(Integer uNo) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(uNo);
	}

	public User queryAllUsersByUno(Integer uNo) {
		// TODO Auto-generated method stub
		return userDao.queryAllUsersByUno(uNo);
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	public List<User> queryAllWorkers() {
		// TODO Auto-generated method stub
		return userDao.queryAllWorkers();
	}
	
}
