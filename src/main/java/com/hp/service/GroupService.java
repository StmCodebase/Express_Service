package com.hp.service;

import java.util.List;

import com.hp.bean.Group;

public interface GroupService {
	//查询
	List<Group> queryAllGroups();
	
	//增加
	int insertSelective(Group record);
	 
	//更新 
	int updateByPrimaryKeySelective(Group record);
	
	//删除
	int deleteByPrimaryKey(Integer gNo);
	
	//模糊查询
	List<Group> queryGroupsByExample(String search);
	
	//gNo查询
	Group queryGroupsBygNo(Integer gNo);

}
