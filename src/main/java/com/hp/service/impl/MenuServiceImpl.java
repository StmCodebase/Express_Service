package com.hp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.bean.Menu;
import com.hp.bean.User;
import com.hp.dao.MenuDao;
import com.hp.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao menuDao;

	public Menu queryRootMenu() {
		// TODO Auto-generated method stub
		return menuDao.queryRootMenu();
	}

	public List<Menu> queryChildrenMenu(Integer menuNo) {
		// TODO Auto-generated method stub
		return menuDao.queryChildrenMenu(menuNo);
	}

	public List<Menu> queryAllMenu() {
		// TODO Auto-generated method stub
		return menuDao.queryAllMenu();
	}

	public List<Integer> queryMenuNosByRoNo(Integer roNo) {
		return menuDao.queryMenuNosByRoNo(roNo);
	}

	public List<Menu> queryMenuByUser(User loginUser) {
		// TODO Auto-generated method stub
		return menuDao.queryMenuByUser(loginUser);
	}
	
	
}
