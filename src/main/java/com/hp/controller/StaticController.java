package com.hp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/static")
public class StaticController {

	@RequestMapping("/intro")
	public ModelAndView intro(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/intro.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}

	@RequestMapping("/electron")
	public ModelAndView electron(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/electron.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	
	@RequestMapping("/fmcg")
	public ModelAndView fmcg(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/fmcg.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	@RequestMapping("/fresh")
	public ModelAndView fresh(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/fresh.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	@RequestMapping("/healthcare")
	public ModelAndView healthcare(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/healthcare.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	@RequestMapping("/freightLimitationQuerys")
	public ModelAndView freightLimitationQuerys(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/freightLimitationQuerys.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
	
	@RequestMapping("/termsOfService")
	public ModelAndView termsOfService(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "static/termsOfService.jsp");
		modelAndView.setViewName("userMain");
		return modelAndView;
	}
}
