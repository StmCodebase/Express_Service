package com.hp.service;

import com.hp.bean.Account_num;
import com.hp.bean.User;

public interface LoginService {

	Account_num queryLoginNumForAdmin(Account_num account_num);

	User queryLoginUserForAdmin(Integer accNo);


	Account_num queryLoginNumForUser(Account_num account_num);
	
	int insertSelective(Account_num record);

	Account_num queryLoginNumForNumAndPwd(Account_num account_num);

	Integer queryGnoFromGroupForGname(String gName);
	
	int insertSelective(User record);
}
