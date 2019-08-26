package com.hp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.User;
import com.hp.service.UserService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	//用户表（全部）
	@RequestMapping("/userTable")
	public ModelAndView userTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = userService.queryAllUsers();
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("mainPage", "user/userTable.jsp");
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
		List<User> users=userService.queryUsersByExample(search);
		
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "user/userTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	
	//删除快递员
		@RequestMapping("/delete")
		public String delete(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uNo") Integer uNo) {
			System.out.println("delete"+uNo);		
			userService.deleteByPrimaryKey(uNo);
			return "redirect: userTable";
		}
			

			//插入页面跳转
			@RequestMapping("/insertUser")
			public ModelAndView insertUser(HttpServletRequest httpServletRequest) {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("mainPage", "user/insertUser.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			

			//快递员插入
			@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
			public String userAdd(User user,HttpSession httpSession) {
			
				userService.insertSelective(user);
				return "redirect: userTable";

			}
			
			//更新页面跳转
			@RequestMapping("/updateUser")
			public ModelAndView updateUser(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "uNo") Integer uNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				User user = userService.queryAllUsersByUno(uNo);
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("user",user);
				modelAndView.addObject("mainPage", "user/updateUser.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			//快递员信息更新
			@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
			public String updateUser(User user,HttpServletRequest httpServletRequest) {
				
				userService.updateByPrimaryKeySelective(user);
				return "redirect: userTable";
			}
			
			
			//日期转换，不动
			@InitBinder  
			public void initBinder(WebDataBinder binder) {  
			        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			        dateFormat.setLenient(false);  
			        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
			        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)); 
//			        binder.registerCustomEditor(int.class, new IntEditor());
//			        binder.registerCustomEditor(long.class, new LongEditor());  
//			        binder.registerCustomEditor(double.class, new DoubleEditor());  
//			        binder.registerCustomEditor(float.class, new FloatEditor()); 
			}
			
			//用户个人信息页
			@RequestMapping("/userInfo")
			public ModelAndView updateAdmin(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "uNo") Integer uNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				ModelAndView modelAndView = new ModelAndView();
				User user = userService.queryAllUsersByUno(uNo);
				
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("user",user);
				modelAndView.addObject("mainPage", "user/userInfo.jsp");
				modelAndView.setViewName("userMain");
				return modelAndView;
			}
		
			//用户个人资料更改
			@ResponseBody
			@RequestMapping(value = "/updateUser2",produces = {"text/html;charset=utf-8"})
			public String userInfo(User user,HttpSession session) {
				JSONObject json = new JSONObject();			
				System.out.println("姓名："+user.getuNo());
				userService.updateByPrimaryKeySelective(user);					
				json.put("result", true);
				
				return json.toString();				
			}
			
			
		
	
}
