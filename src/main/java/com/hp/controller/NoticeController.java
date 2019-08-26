package com.hp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Courier;
import com.hp.bean.Notice;


import com.hp.service.NoticeService;

import com.hp.util.PageUtil;




@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	public NoticeService noticeService;
	
	
//	公告查询（全部）
		@RequestMapping("/noticeTable")
		public ModelAndView noticeTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			
			
			PageHelper.startPage(pageNum, pageSize);
			List<Notice> notices = noticeService.queryAllNotices();
			PageInfo<Notice> pageInfo = new PageInfo<Notice>(notices);
			
			
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "notice/noticeTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		//模糊查询
		@RequestMapping("search")
		public ModelAndView search
			(		@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,
					@RequestParam(required = true,value = "search") String search,
					HttpServletRequest httpServletRequest) {
			System.out.println("search"+search);
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			PageHelper.startPage(pageNum, pageSize);
			List<Notice> notices = noticeService.queryNoticesByExample(search);
			
			PageInfo<Notice> pageInfo = new PageInfo<Notice>(notices);
			System.out.println("notices size:"+notices.size());
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "notice/noticeTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		

	//删除公告
	@RequestMapping("/delete")
	public String delete(
			HttpServletRequest httpServletRequest,
			@RequestParam(required = true,value = "noticeNo") Integer noticeNo) {	
			noticeService.deleteByPrimaryKey(noticeNo);
			return "redirect: noticeTable";
	}
		

		//插入页面跳转
		@RequestMapping("/insertNotice")
		public ModelAndView insertNotice(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "notice/insertNotice.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		//更新页面跳转
		@RequestMapping("/updateNotice")
		public ModelAndView updateCourier(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "noticeNo") Integer noticeNo) {
			HttpSession httpSession = httpServletRequest.getSession();
			Notice notice = noticeService.queryAllNoticesByNoticeNo(noticeNo);
//			System.out.println(notice.getNoticeTitle());
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("notice",notice);
			modelAndView.addObject("mainPage", "notice/updateNotice.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		
		
		
		//公告插入
		@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
		public String noticeAdd( Notice notice,HttpServletRequest httpServletRequest) {			
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			notice.setNoticeTime(currentDate);			
			noticeService.insertSelective(notice);			
			return "redirect: noticeTable";
		}
		
		//公告更新
		@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
		public String updateNotice(Notice notice,HttpServletRequest httpServletRequest) {			
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			notice.setNoticeTime(currentDate);
			noticeService.updateByPrimaryKeySelective(notice);
			return "redirect: noticeTable";
		}
		
		//用户查看公告
		@RequestMapping("/userNoticeTable")
		public ModelAndView userNoticeTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			
			
			PageHelper.startPage(pageNum, pageSize);
			List<Notice> notices = noticeService.queryAllNotices();
			PageInfo<Notice> pageInfo = new PageInfo<Notice>(notices);
			
			
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "notice/userNoticeTable.jsp");
			modelAndView.setViewName("userMain");
			return modelAndView;
		}
		
		//用户查看公告详情	
		@RequestMapping("/userNoticeText")
		public ModelAndView userNoticeText(@RequestParam(required = true,value = "noticeNo") Integer noticeNo,HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			Notice notice = noticeService.queryAllNoticesByNoticeNo(noticeNo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("notice",notice);
			modelAndView.addObject("mainPage", "notice/userNoticeText.jsp");
			modelAndView.setViewName("userMain");
			return modelAndView;
		}
		
		
}
