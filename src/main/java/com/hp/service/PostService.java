package com.hp.service;

import java.util.List;

import com.hp.bean.Post;


public interface PostService {
	
	//根据快递单号查询快递信息（不包含路径）
	Post selectByPrimaryKey(Integer poNo);
	
	//根据手机号查询快递信息（不包含路径，输入post）
	List<Post> queryAllPostsByPoAddresseePhone(Post post);

	//根据手机号查询快递信息（不包含路径，输入poSenderPhone）
	List<Post> queryAllPostsByPoAddresseePhone2(String poAddresseePhone);

	List<Post> queryAllPostsBypoNo(String poNo);
	
	//插入快递信息
	int insertSelective(Post record);
	
	//查询pono
	Post queryAllPostsPono();
	
	//更新
	int updateByPrimaryKeySelective(Post record);

}
