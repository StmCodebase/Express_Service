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

import com.hp.service.CourierService;

import com.hp.util.PageUtil;

@Controller
@RequestMapping("/courier")
public class CourierController {
	
	@Autowired
	public CourierService courierService;
	
	/*暂时已废弃，请勿编辑
	@RequestMapping("/queryAllCouriers")
	public String queryAllCouriers(Model model) {
		List<Courier> couriers = courierService.queryAllCouriers();
		model.addAttribute("couriers",couriers);
		return "courier/queryAllCouriers";
	}*/
	
	//快递员表
	@RequestMapping("/courierTable")
	public ModelAndView courierTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		PageHelper.startPage(pageNum, pageSize);		
		List<Courier> couriers = courierService.queryAllCouriers();
		PageInfo<Courier> pageInfo = new PageInfo<Courier>(couriers);
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);		
		modelAndView.addObject("mainPage", "courier/courierTable.jsp");
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
		List<Courier> couriers = courierService.queryCouriersByExample(search);
		
		PageInfo<Courier> pageInfo = new PageInfo<Courier>(couriers);
		System.out.println("couriers size:"+couriers.size());
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "courier/courierTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	
	//删除快递员
		@RequestMapping("/delete")
		public String delete(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "courierNo") Integer courierNo) {
			System.out.println("delete"+courierNo);		
			int row = courierService.deleteByPrimaryKey(courierNo);
			System.out.println("del"+row);
			return "redirect: courierTable";
		}
			

			//插入页面跳转
			@RequestMapping("/insertCourier")
			public ModelAndView insertCourier(HttpServletRequest httpServletRequest) {
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("mainPage", "courier/insertCourier.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			//更新页面跳转
			@RequestMapping("/updateCourier")
			public ModelAndView updateCourier(HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "courierNo") Integer courierNo) {
				HttpSession httpSession = httpServletRequest.getSession();
				Courier courier = courierService.queryAllCouriersBycourierNo(courierNo);
//				System.out.println(notice.getNoticeTitle());
				ModelAndView modelAndView = new ModelAndView();
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("courier",courier);
				modelAndView.addObject("mainPage", "courier/updateCourier.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			
			
			
			//快递员插入
			@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
			public String courierAdd(Courier courier,HttpSession httpSession) {
				courierService.insertSelective(courier);
				return "redirect: courierTable";

			}
			
			//快递员信息更新
			@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
			public String updateCourier(Courier courier,HttpServletRequest httpServletRequest) {
				
//				java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
//				courier.setNoticeTime(currentDate);
				courierService.updateByPrimaryKeySelective(courier);
				return "redirect: courierTable";
			}
			
	
	
}
