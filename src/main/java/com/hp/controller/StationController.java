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
import com.hp.bean.Station;
import com.hp.service.StationService;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/station")
public class StationController {

	@Autowired
	public StationService stationService;
	
	
	//网点信息表
	@RequestMapping("/stationTable")
	public ModelAndView stationTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		
		
		PageHelper.startPage(pageNum, pageSize);
		List<Station> stations = stationService.queryAllStations();
		PageInfo<Station> pageInfo = new PageInfo<Station>(stations);
		
		
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "station/stationTable.jsp");
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
				List<Station> stations=stationService.queryStationsByExample(search);
				
				PageInfo<Station> pageInfo = new PageInfo<Station>(stations);
				modelAndView.addObject("pageInfo", pageInfo);
				modelAndView.addObject("httpSession",httpSession);
				modelAndView.addObject("mainPage", "station/stationTable.jsp");
				modelAndView.setViewName("adminMain");
				return modelAndView;
			}
			
			
			//删除快递员
				@RequestMapping("/delete")
				public String delete(
						HttpServletRequest httpServletRequest,
						@RequestParam(required = true,value = "staNo") Integer staNo) {
					System.out.println("delete"+staNo);		
					stationService.deleteByPrimaryKey(staNo);
					return "redirect: stationTable";
				}
					

					//插入页面跳转
					@RequestMapping("/insertStation")
					public ModelAndView insertStation(HttpServletRequest httpServletRequest) {
						ModelAndView modelAndView = new ModelAndView();
						modelAndView.addObject("mainPage", "station/insertStation.jsp");
						modelAndView.setViewName("adminMain");
						return modelAndView;
					}
					
					//更新页面跳转
					@RequestMapping("/updateStation")
					public ModelAndView updateStation(HttpServletRequest httpServletRequest,
							@RequestParam(required = true,value = "staNo") Integer staNo) {
						HttpSession httpSession = httpServletRequest.getSession();
						Station station = stationService.queryAllStationsBystaNo(staNo);
						ModelAndView modelAndView = new ModelAndView();
						modelAndView.addObject("httpSession",httpSession);
						modelAndView.addObject("station",station);
						modelAndView.addObject("mainPage", "station/updateStation.jsp");
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
//					        binder.registerCustomEditor(int.class, new IntEditor());
//					        binder.registerCustomEditor(long.class, new LongEditor());  
//					        binder.registerCustomEditor(double.class, new DoubleEditor());  
//					        binder.registerCustomEditor(float.class, new FloatEditor()); 
					}
				
					
					
					//快递员插入
					@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
					public String stationAdd(Station station,HttpSession httpSession) {
					
						stationService.insertSelective(station);
						return "redirect: stationTable";

					}
					
					//快递员信息更新
					@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
					public String updateStation(Station station,HttpServletRequest httpServletRequest) {
						
						stationService.updateByPrimaryKeySelective(station);
						return "redirect: stationTable";
					}
}
