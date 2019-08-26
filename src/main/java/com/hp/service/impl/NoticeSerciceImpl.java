package com.hp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Notice;
import com.hp.dao.NoticeDao;
import com.hp.dao.NoticeMapper;
import com.hp.service.NoticeService;

@Service
public class NoticeSerciceImpl implements NoticeService{

	@Autowired
	public NoticeDao noticeDao;
	
	@Autowired
	public NoticeMapper noticeMapper;
	
	public List<Notice> queryAllNotices(){
		return noticeDao.queryAllNotices();
	}

	public int insertSelective(Notice record) {
		// TODO Auto-generated method stub
		return noticeMapper.insertSelective(record);
	}

	public int deleteByPrimaryKey(Integer noticeNo) {
		// TODO Auto-generated method stub
		return noticeMapper.deleteByPrimaryKey(noticeNo);
	}

	public Notice queryAllNoticesByNoticeNo(Integer noticeNo) {
		// TODO Auto-generated method stub
		return noticeDao.queryAllNoticesByNoticeNo(noticeNo);
	}

	public int updateByPrimaryKeySelective(Notice record) {
		// TODO Auto-generated method stub
		return noticeMapper.updateByPrimaryKeySelective(record);
	}

	public List<Notice> queryNoticesByExample(String search) {
		// TODO Auto-generated method stub
		return noticeDao.queryNoticesByExample(search);
	}
}
