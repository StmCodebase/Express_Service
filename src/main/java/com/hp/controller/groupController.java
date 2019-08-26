package com.hp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Group;
import com.hp.bean.User;
import com.hp.service.GroupService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/group")
public class groupController {

	@Autowired
	public GroupService groupservice;
	
	//查询全部
	@RequestMapping("/groupTable")
	public ModelAndView groupTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<Group> groups = groupservice.queryAllGroups();
		PageInfo<Group> pageInfo = new PageInfo<Group>(groups);
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("mainPage", "group/groupTable.jsp");
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
		List<Group> groups=groupservice.queryGroupsByExample(search);
		
		PageInfo<Group> pageInfo = new PageInfo<Group>(groups);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "group/groupTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	
	//删除
		@RequestMapping("/delete")
		public String delete(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "gNo") Integer gNo) {
			System.out.println("delete"+gNo);		
			groupservice.deleteByPrimaryKey(gNo);
			return "redirect: groupTable";
		}
			

			//插入页面跳转
			@RequestMapping("/insertGroup")
			public ModelAndView insertGroup(HttpServletRequest httpServletRequest) {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("mainPage", "group/insertGroup.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			

			//插入
			@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
			public String groupAdd(Group group,HttpSession httpSession) {
			
				groupservice.insertSelective(group);
				return "redirect: groupTable";

			}
			
			//更新页面跳转
			@RequestMapping("/updateGroup")
			public ModelAndView updateGroup(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "gNo") Integer gNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				Group group = groupservice.queryGroupsBygNo(gNo);
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("group",group);
				modelAndView.addObject("mainPage", "group/updateGroup.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			//更新
			@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
			public String updateGroup(Group group,HttpServletRequest httpServletRequest) {
				
				groupservice.updateByPrimaryKeySelective(group);
				return "redirect: groupTable";
			}
			
			
			//日期转换，不动
			@InitBinder  
			public void initBinder(WebDataBinder binder) {  
			        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			        dateFormat.setLenient(false);  
			        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
			        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); 
//				        binder.registerCustomEditor(int.class, new IntEditor());
//				        binder.registerCustomEditor(long.class, new LongEditor());  
//				        binder.registerCustomEditor(double.class, new DoubleEditor());  
//				        binder.registerCustomEditor(float.class, new FloatEditor()); 
			}
}
