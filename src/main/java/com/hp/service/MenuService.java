package com.hp.service;

import java.util.List;

import com.hp.bean.Menu;
import com.hp.bean.User;

public interface MenuService {

	Menu queryRootMenu();

	List<Menu> queryChildrenMenu(Integer menuNo);

	List<Menu> queryAllMenu();

	List<Integer> queryMenuNosByRoNo(Integer roNo);

	List<Menu> queryMenuByUser(User loginUser);
}
