package com.hp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.hp.bean.Account_num;
import com.hp.bean.Menu;
import com.hp.bean.User;

import com.hp.service.LoginService;
import com.hp.service.MenuService;
import com.hp.service.UserService;


@Controller
public class DispatcherController {
	
	@Autowired
	public  LoginService loginService;
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userMain")
	public ModelAndView userMain(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", null);
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	@RequestMapping("/adminMain")
	public ModelAndView adminMain(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		Account_num loginNum = (Account_num)httpSession.getAttribute("loginNum");
		User loginUser = (User)httpSession.getAttribute("loginUser");
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("loginNum",loginNum);
		modelAndView.addObject("loginUser",loginUser);
		modelAndView.addObject("mainPage", null);
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
	
	@RequestMapping("/userLogin")
	public String userLogin() {
		return "userLogin";
	}
	
	@ResponseBody
	@RequestMapping("/doAdminLogin")
	public String doAdminLogin(HttpSession session,Account_num account_num) {
		System.out.println(account_num+" "+account_num.getAccNum()+" "+account_num.getAccPwd());
		JSONObject json = new JSONObject();
		Account_num loginNum = loginService.queryLoginNumForAdmin(account_num);
		if (loginNum != null) {
			System.out.println(loginNum.getAccNo()+" "+loginNum.getAccNum());
			User loginUser = loginService.queryLoginUserForAdmin(loginNum.getAccNo());
			
			List<Menu> menus = menuService.queryMenuByUser(loginUser);
			Menu rootMenu=null;
			Map<Integer, Menu> menuMap = new HashMap<Integer, Menu>();
			for(Menu m: menus) {
				menuMap.put(m.getMenuNo(),m);
			}
			for(Menu m: menus) {
				Menu child= m;
				if(child.getMenuUpperNo()==-1) {
					rootMenu=child;
				}else {
					Menu parent=menuMap.get(child.getMenuUpperNo());
					parent.getChildren().add(child);
				}
			}
			session.setAttribute("rootMenu", rootMenu);
			session.setAttribute("loginNum", loginNum);
			session.setAttribute("loginUser", loginUser);
			json.put("result", true);
		} else {
			json.put("result", false);
		}
		return json.toString();
	}
	
	@ResponseBody
	@RequestMapping("/doUserLogin")
	public String doUserLogin(HttpSession session,Account_num account_num) {
		System.out.println(account_num+" "+account_num.getAccNum()+" "+account_num.getAccPwd());
		JSONObject json = new JSONObject();
		Account_num loginNum = loginService.queryLoginNumForUser(account_num);
		if (loginNum != null) {
			System.out.println(loginNum.getAccNo()+" "+loginNum.getAccNum());
			User loginUser = loginService.queryLoginUserForAdmin(loginNum.getAccNo());
			
			session.setAttribute("loginNum", loginNum);
			session.setAttribute("loginUser", loginUser);
			json.put("result", true);
			json.put("identity", "user");
		} else {
			loginNum = loginService.queryLoginNumForAdmin(account_num);
			if (loginNum != null) {
				System.out.println(loginNum.getAccNo()+" "+loginNum.getAccNum());
				User loginUser = loginService.queryLoginUserForAdmin(loginNum.getAccNo());
				
				List<Menu> menus = menuService.queryMenuByUser(loginUser);
				Menu rootMenu=null;
				Map<Integer, Menu> menuMap = new HashMap<Integer, Menu>();
				for(Menu m: menus) {
					menuMap.put(m.getMenuNo(),m);
				}
				for(Menu m: menus) {
					Menu child= m;
					if(child.getMenuUpperNo()==-1) {
						rootMenu=child;
					}else {
						Menu parent=menuMap.get(child.getMenuUpperNo());
						parent.getChildren().add(child);
					}
				}
				session.setAttribute("rootMenu", rootMenu);
				
				session.setAttribute("loginNum", loginNum);
				session.setAttribute("loginUser", loginUser);
				json.put("result", true);
				json.put("identity", "admin");
			}else {
				json.put("result", false);
			}
		}
		return json.toString();
	}
	
	//注册页面
	@RequestMapping("/UserReg")
	public String UserReg() {
		return "UserReg";
	}
	
	//执行注册操作
	@ResponseBody
	@RequestMapping("/doUserReg")
	public String doUserReg(HttpSession session,Account_num account_num) {
		System.out.println(account_num+" "+account_num.getAccNum()+" "+account_num.getAccPwd());
		JSONObject json = new JSONObject();
		Account_num loginNum = loginService.queryLoginNumForUser(account_num);
		if (loginNum == null) {
			account_num.setAccState("正常");
			int i = loginService.insertSelective(account_num);
			if (i<=0) {
				json.put("result", false);
			}else {
				account_num = loginService.queryLoginNumForNumAndPwd(account_num);
				User newUser = new User();
				newUser.setAccNo(account_num.getAccNo());
				String gName ="用户组";
				newUser.setgNo(loginService.queryGnoFromGroupForGname(gName));
				int j = loginService.insertSelective(newUser);
				if (j<=0) {
					json.put("result", false);
					userService.deleteByPrimaryKey(account_num.getAccNo());
				}else {
					json.put("result", true);
				}
				}
			
		}else {
			json.put("result", false);
		}
		
		return json.toString();
	}
	
	@RequestMapping("/loginOut")
	public String logingOut(HttpSession session) {
		session.invalidate();	
		return "redirect:userLogin";	
	}
	
	
}
