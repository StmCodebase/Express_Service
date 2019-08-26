package com.hp.service;

import java.util.List;


import com.hp.bean.User;

public interface UserService {
	
	//查询用户
	List<User> queryAllUsers();
	
	//模糊查询
	List<User> queryUsersByExample(String search);
				
	//删除
	int deleteByPrimaryKey(Integer uNo);
				 
	//编号查询
	User queryAllUsersByUno(Integer uNo);
				 
	//插入
	int insertSelective(User record);
				 
	//更新
	int updateByPrimaryKeySelective(User record);

	//查询员工
	List<User> queryAllWorkers();
}
