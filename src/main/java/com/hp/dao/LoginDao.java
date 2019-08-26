package com.hp.dao;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Account_num;
import com.hp.bean.User;

public interface LoginDao {

	@Select("select a.* from e_account_num a INNER JOIN e_user e ON a.ACC_NO = e.ACC_NO where ACC_NUM = #{accNum} and ACC_PWD = #{accPwd} AND e.G_NO != (SELECT G_NO from e_group where G_NAME = '用户组')")
	Account_num queryLoginNumForAdmin(Account_num account_num);

	@Select("select * from e_user where ACC_NO = #{accNo}")
	User queryLoginUserForAdmin(Integer accNo);

	@Select("select a.* from e_account_num a INNER JOIN e_user e ON a.ACC_NO = e.ACC_NO where ACC_NUM = #{accNum} and ACC_PWD = #{accPwd} AND e.G_NO = (SELECT G_NO from e_group where G_NAME = '用户组')")
	Account_num queryLoginNumForUser(Account_num account_num);

	@Select("select * from e_account_num where ACC_NUM = #{accNum} and ACC_PWD = #{accPwd}")
	Account_num queryLoginNumForNumAndPwd(Account_num account_num);

	@Select("select G_NO from e_group where G_NAME = #{gName}")
	Integer queryGnoFromGroupForGname(String gName);
}
