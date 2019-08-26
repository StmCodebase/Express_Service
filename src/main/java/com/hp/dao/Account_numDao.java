package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Account_num;

public interface Account_numDao {
	@Select("select ACC_NUM from e_account_num")
	List<Account_num> queryAllAccNum();
	
	@Select("select * from e_account_num where ACC_NUM = #{accNum} and ACC_PWD =#{accPwd}")
	Account_num queryAccount_numsByAccount_num(Account_num Account_num);
}
