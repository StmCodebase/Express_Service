package com.hp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.hp.bean.User;

public interface UserDao {

	@Select("select * from e_user where g_no =1")
	List<User> queryAllUsers();
	
	@Select("select * from e_user where g_no !=1")
	List<User> queryAllWorkers();
	
	@Select("select * from e_user where u_no = #{uNo}")
	User queryAllUsersByUno(Integer uNo);
	
	List<User> queryUsersByExample(String search);
	
	
}
