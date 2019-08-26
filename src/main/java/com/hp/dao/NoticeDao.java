package com.hp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hp.bean.Notice;

public interface NoticeDao {

	@Select("select * from e_notice")
	List<Notice> queryAllNotices();
	
	@Select("select * from e_notice where notice_no = #{noticeNo}")
	Notice queryAllNoticesByNoticeNo(Integer noticeNo);
	
	List<Notice> queryNoticesByExample(String search);
}
