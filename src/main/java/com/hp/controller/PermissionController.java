package com.hp.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.bean.Permission;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	
	/**
	 * .权限校验控制器，主要用于控制用户组权限验证等功能
	 * .请勿修改、添加内容
	 * */
	
	
	@RequestMapping("/permissionTest")
	public String permissionTest() {
		return "test/permissionTest";
	}
	
	@ResponseBody
	@RequestMapping("/loadData")
	public Object loadData() {
		List<Permission> permissions = new ArrayList<Permission>();
		
		Permission p1 = new Permission();
		Permission p2 = new Permission();
		Permission p3 = new Permission();
		Permission p4 = new Permission();
		Permission p5 = new Permission();
		Permission p6 = new Permission();
		
		p1.setName("A");
		p2.setName("bb");
		p3.setName("ccc");
		p4.setName("dd");
		p5.setName("ee");
		p6.setName("F");
		
		p1.getChildren().add(p2);
		p2.getChildren().add(p3);
		p1.getChildren().add(p4);
		p6.getChildren().add(p5);
		permissions.add(p1);
		permissions.add(p6);
		return permissions;
	}
}
