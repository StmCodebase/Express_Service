package com.hp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Access_records;
import com.hp.bean.Courier;
import com.hp.bean.Post;
import com.hp.bean.Stock;
import com.hp.bean.User;
import com.hp.service.Access_recordsService;
import com.hp.service.PostService;
import com.hp.service.StockSservice;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	public PostService postService;
	
	@Autowired
	public Access_recordsService access_recordsService;
	
	
	
	@Autowired
	public StockSservice stockService;
	
	//快递信息（test）
		@RequestMapping("/postTable")
		public ModelAndView postTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest,Post post) {
			Integer pageSize=PageUtil.getPageSize();
			ModelAndView modelAndView = new ModelAndView();
			HttpSession httpSession = httpServletRequest.getSession();
			
			
			PageHelper.startPage(pageNum, pageSize);
			Post post1 = new Post();
			post1.setPoAddresseePhone("13843214321");
			List<Post> posts = postService.queryAllPostsByPoAddresseePhone(post1);
			PageInfo<Post> pageInfo = new PageInfo<Post>(posts);
			
			
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "post/postTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		//快递查询（电话号码）
		@ResponseBody
		@RequestMapping("/queryExpressBypoSenderPhone")
		public String queryExpressBypoSenderPhone(HttpSession session,String poSenderPhone) {
			System.out.println(poSenderPhone);
			JSONObject json = new JSONObject();
			List<Post> posts = postService.queryAllPostsByPoAddresseePhone2(poSenderPhone);			
			if(!posts.isEmpty()&&posts!=null) {
				session.setAttribute("posts", posts);
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			
			return json.toString();
		}
		
		//快递查询（订单号）
		@ResponseBody
		@RequestMapping("/queryExpressBypoNo")
		public String queryExpressBypoNo(HttpSession session,String poNo) {
			JSONObject json = new JSONObject();
			System.out.println(poNo);
			List<Post> posts = postService.queryAllPostsBypoNo(poNo);			
			if(!posts.isEmpty()||posts==null) {
				session.setAttribute("posts", posts);
				json.put("result", true);
			}else {
				json.put("result", false);
			}
			return json.toString();
			
		}
		
		
		//电话查询页跳转
		@RequestMapping("/searchNumber")
		public ModelAndView searchNumber(HttpServletRequest httpServletRequest) {		
			ModelAndView modelAndView = new ModelAndView();			
			HttpSession httpSession = httpServletRequest.getSession();			
			modelAndView.addObject("httpSession",httpSession);	
			modelAndView.addObject("mainPage", "searchExpress/searchNumber.jsp");
			modelAndView.setViewName("userMain");			
			return modelAndView;	
		}
		
		//订单查询页跳转
		@RequestMapping("/searchOrder")
		public ModelAndView searchOrder(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();			
			HttpSession httpSession = httpServletRequest.getSession();			
			modelAndView.addObject("httpSession",httpSession);	
			modelAndView.addObject("mainPage", "searchExpress/searchOrder.jsp");
			modelAndView.setViewName("userMain");			
			return modelAndView;	
		}
		
		//查询结果
		@RequestMapping("/searchResult")
		public ModelAndView searchResult(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
			Integer pageSize=PageUtil.getPageSize();
					
			ModelAndView modelAndView = new ModelAndView();
			PageHelper.startPage(pageNum, pageSize);
			HttpSession httpSession = httpServletRequest.getSession();
			List<Post> posts= (List<Post>) httpSession.getAttribute("posts");
			for (int i = 0; i < posts.size(); i++) {
				if (posts.get(i).getPoEndTime()==null) {
					posts.get(i).setStatus("未送达");
				}else {
					posts.get(i).setStatus("已送达");
				}
			}
			PageInfo<Post> pageInfo = new PageInfo<Post>(posts);
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("posts",posts);
			modelAndView.addObject("httpSession",httpSession);	
			modelAndView.addObject("mainPage", "searchExpress/searchResult.jsp");
			modelAndView.setViewName("userMain");			
			return modelAndView;			
		}
		
		//寄快递页面跳转
		@RequestMapping("/addExpress")
		public ModelAndView addExpress(
			HttpServletRequest httpServletRequest) {						
				ModelAndView modelAndView = new ModelAndView();				
				HttpSession httpSession = httpServletRequest.getSession();	
				modelAndView.addObject("httpSession",httpSession);	
				modelAndView.addObject("mainPage", "searchExpress/addExpress.jsp");
				modelAndView.setViewName("userMain");			
				return modelAndView;			
		}
		
		
		//寄快递提交
		@ResponseBody
		@RequestMapping("/submitExpress")
		public String sendExpressAdd(HttpSession session,Post post) {
			JSONObject json = new JSONObject();
			//postService.insertSelective(post);
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			post.setPoStarTime(currentDate);
			Random random = new Random();
			Integer integer = random.nextInt(200);
			Integer integer2 = random.nextInt(50);
			post.setCourierStar(integer);
			if (integer<100) {
				post.setPoPay("支付宝");
			}else {
				post.setPoPay("微信");
			}
			
			Access_records access_records = new Access_records();
			access_records.setAccStartTime(post.getPoStarTime());
			access_records.setStockNum(integer2);
			access_records.setStockStateNo("2");
			postService.insertSelective(post);
			Post post2 = postService.queryAllPostsPono();
			access_records.setPoNo(post2.getPoNo());
			access_recordsService.insertSelective(access_records);
			json.put("result", true);
			
			return json.toString();
		}
		
		//支付页面跳转
		@RequestMapping("/pay")
		public ModelAndView pay(HttpServletRequest httpServletRequest) {						
				ModelAndView modelAndView = new ModelAndView();				
				HttpSession httpSession = httpServletRequest.getSession();	
				modelAndView.addObject("httpSession",httpSession);	
				modelAndView.addObject("mainPage", "searchExpress/pay.jsp");
				modelAndView.setViewName("userMain");			
				return modelAndView;		
		}
		
		//物流轨迹
				@RequestMapping("/queryRoute")
				public ModelAndView queryRoute(HttpServletRequest httpServletRequest , Integer poNo) {
					System.out.println("Controller");
					ModelAndView modelAndView = new ModelAndView();
					HttpSession httpSession = httpServletRequest.getSession();
					
					Access_records access_records = new Access_records();
					access_records.setPoNo(poNo);
					Post post =  postService.selectByPrimaryKey(poNo);
					Stock stock = new Stock();
					List<String> strList = new ArrayList<String>();
					List<Access_records> list = access_recordsService.queryAccessrecordsByPono(access_records);
					
					if (post.getPoStarTime()!=null) {
						java.sql.Timestamp StartDate = new java.sql.Timestamp(post.getPoStarTime().getTime());
						strList.add("我们已收到您的包裹，将于 "+StartDate+" 从 "+post.getPoStarAddress()+"送出。");
						
						for(Access_records a:list) {
							stock.setStockNum(a.getStockNum());
							stock = stockService.queryAllStocksByStockNum(stock);
							if (a.getAccStartTime()!=null) {
								java.sql.Timestamp InDate = new java.sql.Timestamp(a.getAccStartTime().getTime());
								strList.add(InDate+"时 ，到达 "+stock.getStockName()+" 。");
							}
							if (a.getAccEndTime()!=null) {
								java.sql.Timestamp OutDate = new java.sql.Timestamp(a.getAccEndTime().getTime());
								strList.add(OutDate+"时 ，已从 "+stock.getStockName()+" 发出。");
							}
						}
						
						if (post.getPoEndTime()!=null) {
							java.sql.Timestamp EndDate = new java.sql.Timestamp(post.getPoStarTime().getTime());
							strList.add(EndDate+" ，包裹已送达至 "+post.getPoEndAddress()+" 感谢您选择天软物流。");
						}
						
					}else {
						strList.add("该订单暂无快递信息");
					}
					
					modelAndView.addObject("strList", strList);
					modelAndView.addObject("httpSession",httpSession);
					modelAndView.addObject("mainPage", "post/queryRouteTable.jsp");
					modelAndView.setViewName("userMain");
					return modelAndView;
				}
				
				//评价页面跳转
				@RequestMapping("/appraise")
				public ModelAndView appraise(Post post,HttpServletRequest httpServletRequest) {						
						ModelAndView modelAndView = new ModelAndView();				
						HttpSession httpSession = httpServletRequest.getSession();	
						modelAndView.addObject("httpSession",httpSession);
						modelAndView.addObject("post",post);
						modelAndView.addObject("mainPage", "post/appraise.jsp");
						modelAndView.setViewName("userMain");			
						return modelAndView;		
				}
				
				//评价
				@ResponseBody
				@RequestMapping(value = "/insertAppraise",produces = {"text/html;charset=utf-8"})
				public String insertAppraise(Post post,HttpServletRequest httpServletRequest) {						
						JSONObject json = new JSONObject();		
						
						System.out.println("333"+post.getPoNo());
						postService.updateByPrimaryKeySelective(post);
						json.put("result", true);

						return json.toString();			
				}
				
				
				
}
