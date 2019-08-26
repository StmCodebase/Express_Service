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
import com.hp.bean.Post;
import com.hp.bean.User;
import com.hp.service.UserService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/worker")
public class WorkerController {

	@Autowired
	public UserService userService;
	
	//用户表（全部）
	@RequestMapping("/workerTable")
	public ModelAndView workerTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = userService.queryAllWorkers();
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("mainPage", "worker/workerTable.jsp");
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
		modelAndView.addObject("mainPage", "worker/workerTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	
	//删除员工
		@RequestMapping("/delete")
		public String delete(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "uNo") Integer uNo) {
			System.out.println("delete"+uNo);		
			userService.deleteByPrimaryKey(uNo);
			return "redirect: workerTable";
		}
			

			//插入页面跳转
			@RequestMapping("/insertWorker")
			public ModelAndView insertWorker(HttpServletRequest httpServletRequest) {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("mainPage", "worker/insertWorker.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			

			//员工插入
			@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
			public String userAdd(User user,HttpSession httpSession) {
			
				userService.insertSelective(user);
				return "redirect: workerTable";

			}
			
			//更新页面跳转
			@RequestMapping("/updateWorker")
			public ModelAndView updateWorker(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "uNo") Integer uNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				User user = userService.queryAllUsersByUno(uNo);
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("user",user);
				modelAndView.addObject("mainPage", "worker/updateWorker.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			//员工信息更新
			@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
			public String updateUser(User user,HttpServletRequest httpServletRequest) {
				
				userService.updateByPrimaryKeySelective(user);
				return "redirect: workerTable";
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
			
			//管理员个人信息页
			@RequestMapping("/admin")
			public ModelAndView updateAdmin(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "uNo") Integer uNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				ModelAndView modelAndView = new ModelAndView();
				User adminUser = userService.queryAllUsersByUno(uNo);
				
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("user",adminUser);
				modelAndView.addObject("mainPage", "admin/adminTable.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			
			//管理员个人资料更改
			@ResponseBody
			@RequestMapping(value = "/updateAdmin",produces = {"text/html;charset=utf-8"})
			public String updateAdmin(User user,HttpSession session) {
				JSONObject json = new JSONObject();				
				System.out.println("姓名："+user.getuName());
				userService.updateByPrimaryKeySelective(user);					
				json.put("result", true);
				
				return json.toString();				
			}
	
}
