package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Group;
import com.hp.dao.GroupDao;
import com.hp.dao.GroupMapper;
import com.hp.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{

	@Autowired
	public GroupMapper groupMapper;
	
	@Autowired
	public GroupDao groupdao;
	
	public List<Group> queryAllGroups() {
		// TODO Auto-generated method stub
		return groupdao.queryAllGroups();
	}

	public int insertSelective(Group record) {
		// TODO Auto-generated method stub
		return groupMapper.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(Group record) {
		// TODO Auto-generated method stub
		return groupMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteByPrimaryKey(Integer gNo) {
		// TODO Auto-generated method stub
		return groupMapper.deleteByPrimaryKey(gNo);
	}

	public List<Group> queryGroupsByExample(String search) {
		// TODO Auto-generated method stub
		return groupdao.queryGroupsByExample(search);
	}

	public Group queryGroupsBygNo(Integer gNo) {
		// TODO Auto-generated method stub
		return groupdao.queryGroupsBygNo(gNo);
	}

	
}
