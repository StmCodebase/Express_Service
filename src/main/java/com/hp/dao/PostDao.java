package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Post;

public interface PostDao {

	
	@Select("select * from e_post where PO_ADDRESSEE_PHONE = #{poAddresseePhone}")
	List<Post> queryAllPostsByPoAddresseePhone(Post post);
	
	@Select("select * from e_post where PO_ADDRESSEE_PHONE = #{poAddresseePhone}")
	List<Post> queryAllPostsByPoAddresseePhone2(String poAddresseePhone);
	
	@Select("select * from e_post where PO_NO = #{poNo}")
	List<Post> queryAllPostsBypoNo(String poNo);
	
	@Select("select MAX(PO_NO) AS PO_NO from e_post" )
	Post queryAllPostsPono();
}
