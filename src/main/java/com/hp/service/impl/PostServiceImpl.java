package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hp.bean.Post;
import com.hp.dao.PostDao;
import com.hp.dao.PostMapper;
import com.hp.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	public PostDao postDao;
	
	@Autowired
	public PostMapper postMapper;
	
	public Post selectByPrimaryKey(Integer poNo){
		return postMapper.selectByPrimaryKey(poNo);
	}

	public List<Post> queryAllPostsByPoAddresseePhone(Post post) {
		// TODO Auto-generated method stub
		return postDao.queryAllPostsByPoAddresseePhone(post);
	}

	public List<Post> queryAllPostsByPoAddresseePhone2(String poAddresseePhone) {
		// TODO Auto-generated method stub
		return postDao.queryAllPostsByPoAddresseePhone2(poAddresseePhone);
	}

	public List<Post> queryAllPostsBypoNo(String poNo) {
		// TODO Auto-generated method stub
		return postDao.queryAllPostsBypoNo(poNo);
	}

	public int insertSelective(Post record) {
		// TODO Auto-generated method stub
		return postMapper.insertSelective(record);
	}

	public Post queryAllPostsPono() {
		// TODO Auto-generated method stub
		return postDao.queryAllPostsPono();
	}

	public int updateByPrimaryKeySelective(Post record) {
		// TODO Auto-generated method stub
		return postMapper.updateByPrimaryKeySelective(record);
	}

	
	
	
	
}
