package com.hp.service;

import java.util.List;
import com.hp.bean.Notice;

public interface NoticeService {

	//查询全部公告
	List<Notice> queryAllNotices();
	
	//插入公告
	int insertSelective(Notice record);
	
	//删除公告
	int deleteByPrimaryKey(Integer noticeNo);
	
	//查询公告（id为条件）
	Notice queryAllNoticesByNoticeNo(Integer noticeNo);
	
	//更新公告
	int updateByPrimaryKeySelective(Notice record);
	
	//模糊查询
	List<Notice> queryNoticesByExample(String search);
}
