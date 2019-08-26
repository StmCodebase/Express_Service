package com.hp.service;

import java.util.List;

import com.hp.bean.Account_num;

public interface Account_numService {
	//插入
	int insertSelective(Account_num record);
	
	//查询账号
	List<Account_num> queryAllAccNum();
	
	//根据账号查询账号id
	Account_num queryAccount_numsByAccount_num(Account_num account_num);
}
