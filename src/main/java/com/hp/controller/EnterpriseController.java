package com.hp.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.hp.bean.Enterprise;
import com.hp.service.EnterpriseService;
import com.hp.util.PageUtil;

import java.util.Date;





@Controller
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	public EnterpriseService enterpriseService;
	
	
	//查询企业信息
	@RequestMapping("/enterpriseTable")
	public ModelAndView enterpriseTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		
		List<Enterprise> enterprises = enterpriseService.queryAllEnterprises();	
		PageInfo<Enterprise> pageInfo = new PageInfo<Enterprise>(enterprises);
		
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "enterprise/enterpriseTable.jsp");
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
			List<Enterprise> enterprises=enterpriseService.queryEnterprisesByExample(search);
			
			PageInfo<Enterprise> pageInfo = new PageInfo<Enterprise>(enterprises);
			System.out.println("couriers size:"+enterprises.size());
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "enterprise/enterpriseTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		
		//删除快递员
			@RequestMapping("/delete")
			public String delete(
					HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "entNo") Integer entNo) {
				System.out.println("delete"+entNo);		
				int row = enterpriseService.deleteByPrimaryKey(entNo);
				System.out.println("del"+row);
				return "redirect: enterpriseTable";
			}
				

				//插入页面跳转
				@RequestMapping("/insertEnterprise")
				public ModelAndView insertEnterprise(HttpServletRequest httpServletRequest) {
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("mainPage", "enterprise/insertEnterprise.jsp");
					modelAndView.setViewName("adminMain");
					return modelAndView;
				}
				
				//更新页面跳转
				@RequestMapping("/updateEnterprise")
				public ModelAndView updateEnterprise(HttpServletRequest httpServletRequest,
						@RequestParam(required = true,value = "entNo") Integer entNo) {
					HttpSession httpSession = httpServletRequest.getSession();
					Enterprise enterprise = enterpriseService.queryAllEnterprisesByentNo(entNo);
//					System.out.println(notice.getNoticeTitle());
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("httpSession",httpSession);
					modelAndView.addObject("enterprise",enterprise);
					modelAndView.addObject("mainPage", "enterprise/updateEnterprise.jsp");
					modelAndView.setViewName("adminMain");
					return modelAndView;
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
			
				
				
				//快递员插入
				@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
				public String enterpriseAdd(Enterprise enterprise,HttpSession httpSession) {
				
					enterpriseService.insertSelective(enterprise);
					return "redirect: enterpriseTable";

				}
				
				//快递员信息更新
				@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
				public String updateEnterprise(Enterprise enterprise,HttpServletRequest httpServletRequest) {
					
					enterpriseService.updateByPrimaryKeySelective(enterprise);
					return "redirect: enterpriseTable";
				}
}
