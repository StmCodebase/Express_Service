package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Group;

public interface GroupDao {
	
	@Select("select * from e_group")
	List<Group> queryAllGroups();
	
	List<Group> queryGroupsByExample(String search);

	@Select("select * from e_group where G_NO = #{gNo}")
	Group queryGroupsBygNo(Integer gNo);

}
