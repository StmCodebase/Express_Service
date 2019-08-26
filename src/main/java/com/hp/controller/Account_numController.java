package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.hp.bean.Account_num;
import com.hp.bean.User;
import com.hp.service.Account_numService;
import com.hp.service.UserService;

@Controller
@RequestMapping("/account_num")
public class Account_numController {
	
	@Autowired
	public Account_numService account_numService;
	@Autowired
	public UserService userService;
	
	
	//跳转userReg页面直接写UserRsg,作用户注册用userReg
	@RequestMapping(value = "/userReg",produces = {"text/html;charset=utf-8"})
	public ModelAndView  userReg( Account_num account_num,HttpServletRequest httpServletRequest) {
		HttpSession httpSession = httpServletRequest.getSession();
		ModelAndView modelAndView = new ModelAndView();
		List<Account_num> account_nums = account_numService.queryAllAccNum();		
		boolean k = true;
		for(int i=0;i<account_nums.size();i++) {			
			if(account_nums.get(i).getAccNum().equals(account_num.getAccNum())) {
				k=false;				
				account_num.setAccNum("账号重复请重试！");
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("account_num",account_num);
//				modelAndView.addObject("mainPage", "UserReg.jsp");	
				modelAndView.setViewName("UserReg");
				break;
			}else {
				k = true;
			}			
			
		}
		if (k) {
			
			account_num.setAccState("正常");
			account_numService.insertSelective(account_num);
			
			User user = new User();
			Account_num account_num2 = account_numService.queryAccount_numsByAccount_num(account_num);
			user.setAccNo(account_num2.getAccNo());
			user.setgNo(1);
			userService.insertSelective(user);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.setViewName("test333");						
		}
		 
		return modelAndView;
		
		
	}

}
