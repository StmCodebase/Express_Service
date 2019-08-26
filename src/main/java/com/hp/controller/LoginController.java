package com.hp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}
}
