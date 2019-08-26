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
import com.hp.bean.Stock;
import com.hp.service.StockSservice;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/stock")
public class StockController {

	@Autowired
	public StockSservice stockService;
	
	//出入库
	
	
	//仓库表
		@RequestMapping("/stockTable")
		public ModelAndView courierTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			
			PageHelper.startPage(pageNum, pageSize);		
			List<Stock> stocks = stockService.queryAllStocks();
			PageInfo<Stock> pageInfo = new PageInfo<Stock>(stocks);
			
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);		
			modelAndView.addObject("mainPage", "stock/stockTable.jsp");
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
			List<Stock> stocks = stockService.queryStocksByExample(search);
			
			PageInfo<Stock> pageInfo = new PageInfo<Stock>(stocks);
			System.out.println("stocks size:"+stocks.size());
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "stock/stockTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		
		//删除仓库
			@RequestMapping("/delete")
			public String delete(
					HttpServletRequest httpServletRequest,
					@RequestParam(required = true,value = "stockNum") Integer stockNum) {
				System.out.println("delete"+stockNum);		
				int row = stockService.deleteByPrimaryKey(stockNum);
				System.out.println("del"+row);
				return "redirect: stockTable";
			}
				

				//插入页面跳转
				@RequestMapping("/insertStock")
				public ModelAndView insertStock(HttpServletRequest httpServletRequest) {
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("mainPage", "stock/insertStock.jsp");
					modelAndView.setViewName("adminMain");
					return modelAndView;
				}
				
				//更新页面跳转
				@RequestMapping("/updateStock")
				public ModelAndView updateStock(HttpServletRequest httpServletRequest,
						@RequestParam(required = true,value = "stockNum") Integer stockNum) {
					HttpSession httpSession = httpServletRequest.getSession();
					Stock stock = stockService.queryAllStocksBycourierNo(stockNum);
//					System.out.println(notice.getNoticeTitle());
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("httpSession",httpSession);
					modelAndView.addObject("stock",stock);
					modelAndView.addObject("mainPage", "stock/updateStock.jsp");
					modelAndView.setViewName("adminMain");
					return modelAndView;
				}
				
				
				
				
				//快递员插入
				@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
				public String stockAdd(Stock stock,HttpSession httpSession) {
					stockService.insertSelective(stock);
					return "redirect: stockTable";

				}
				
				//快递员信息更新
				@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
				public String updateStock(Stock stock,HttpServletRequest httpServletRequest) {
					
//					java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
//					courier.setNoticeTime(currentDate);
					stockService.updateByPrimaryKeySelective(stock);
					return "redirect: stockTable";
				}
				
		
}
