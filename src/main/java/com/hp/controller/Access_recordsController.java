package com.hp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.IconUIResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Access_records;
import com.hp.bean.Post;
import com.hp.service.Access_recordsService;
import com.hp.service.PostService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/access_records")
public class Access_recordsController {
	@Autowired
	public Access_recordsService access_recordService;
	
	@Autowired
	public PostService postService;
	
	//出库表
	@RequestMapping("/outAccess_recordsTable")
	public ModelAndView access_recordTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<Access_records> access_records = access_recordService.queryAllAccess_records();
		for (Access_records s:access_records) {
			s.setPost(postService.selectByPrimaryKey(s.getPoNo()));
		}
		
		PageInfo<Access_records> pageInfo = new PageInfo<Access_records>(access_records);		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "access_records/outAccess_recordsTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	//出库操作
	@RequestMapping("/outStock")
	public String outStrock(Access_records access_records) {
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		access_records.setAccEndTime(currentDate);
		access_records.setStockStateNo("1");
		access_recordService.updateByPrimaryKeySelective(access_records);
		return "redirect: outAccess_recordsTable";
	}
	
	//入库表
	@RequestMapping("/inAccess_recordsTable")
	public ModelAndView inAccess_recordsTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<Access_records> access_records = access_recordService.queryAllInAccess_records();
		for (Access_records s:access_records) {
			s.setPost(postService.selectByPrimaryKey(s.getPoNo()));
		}
		PageInfo<Access_records> pageInfo = new PageInfo<Access_records>(access_records);
		
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "access_records/inAccess_recordsTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	

	
	//入库操作
	@RequestMapping("/inStock")
	public String inStock(Access_records access_records) {
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		Access_records access_records3 = access_recordService.selectByPrimaryKey(access_records.getAccNo());
		Access_records access_records2 = new Access_records();
		access_records2.setAccStartTime(currentDate);
		access_records2.setPoNo(access_records3.getPoNo());
		Random random = new Random();
		Integer integer = random.nextInt(50);
		access_records2.setStockNum(integer);
		access_records2.setStockStateNo("2");
		access_recordService.insertSelective(access_records2);
		return "redirect: inAccess_recordsTable";
	}
	
	//送达操作
		@RequestMapping("/send")
		public String send(Access_records access_records) {
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());	
			Access_records access_records3 = access_recordService.selectByPrimaryKey(access_records.getAccNo());
			Post post = new Post();
			post.setPoNo(access_records3.getPoNo());
			post.setPoEndTime(currentDate);
			System.out.println("post"+post.getPoNo());
			postService.updateByPrimaryKeySelective(post);			
			return "redirect: inAccess_recordsTable";
		}

}
