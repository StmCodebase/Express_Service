package com.hp.service;

import java.util.List;


import com.hp.bean.Enterprise;

public interface EnterpriseService {
	
	//查询全部合作企业资料
	List<Enterprise> queryAllEnterprises();
	
	//模糊查询
		List<Enterprise> queryEnterprisesByExample(String search);
		
		//删除
		 int deleteByPrimaryKey(Integer entNo);
		 
		 //编号查询
		 Enterprise queryAllEnterprisesByentNo(Integer entNo);
		 
		 //插入
		 int insertSelective(Enterprise record);
		 
		 //更新
		 int updateByPrimaryKeySelective(Enterprise record);
}
