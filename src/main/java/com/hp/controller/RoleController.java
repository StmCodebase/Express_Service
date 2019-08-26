package com.hp.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hp.bean.Courier;
import com.hp.bean.Role;
import com.hp.service.PowerService;
import com.hp.service.RoleService;
import com.hp.util.LogicUtil;
import com.hp.util.PageUtil;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private PowerService powerService;
	
	@RequestMapping("/roleTable")
	public ModelAndView roleTable(@RequestParam(defaultValue = "1",required = true,value = "pageNum") Integer pageNum,HttpServletRequest httpServletRequest) {
		Integer pageSize=PageUtil.getPageSize();
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		PageHelper.startPage(pageNum, pageSize);
		List<Role> roles = roleService.queryAllRoles();
		PageInfo<Role> pageInfo = new PageInfo<Role>(roles);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "role/roleTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	@RequestMapping("/assignTable")
	public ModelAndView assignTable(HttpServletRequest httpServletRequest,@RequestParam(required = true,value = "roNo") Integer roNo) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession httpSession = httpServletRequest.getSession();
		modelAndView.addObject("roNo",roNo);
		modelAndView.addObject("httpSession",httpSession);
		modelAndView.addObject("mainPage", "role/assignTable.jsp");
		modelAndView.setViewName("adminMain");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/doAjaxAssign")
	public Object doAjaxAssign( Integer roNo,Integer[] menuNo) {
		LogicUtil result = new LogicUtil();
		try {
			powerService.DeletePowerForRoNo(roNo);
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("roNo", roNo);
			paramMap.put("menuNo", menuNo);
			roleService.insertRoleAssign(paramMap);
			result.setLogic(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setLogic(false);
		}
		return result;
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
			List<Role> roles = roleService.queryRoleByExample(search);
			
			PageInfo<Role> pageInfo = new PageInfo<Role>(roles);
			modelAndView.addObject("pageInfo", pageInfo);
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("mainPage", "role/roleTable.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
		
		
		//删除
		@RequestMapping("/delete")
		public String delete(
				HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "roNo") Integer roNo) {
			Integer rono=roNo;
			roleService.deleteByPrimaryKey(rono);
			roleService.deleteGroupByroNo(rono);
			return "redirect: roleTable";
		}
					

		//插入页面跳转
		@RequestMapping("/insertRole")
		public ModelAndView insertCourier(HttpServletRequest httpServletRequest) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("mainPage", "role/insertRole.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
					
		//更新页面跳转
		@RequestMapping("/updateRole")
		public ModelAndView updateCourier(HttpServletRequest httpServletRequest,
				@RequestParam(required = true,value = "roNo") Integer roNo) {
			HttpSession httpSession = httpServletRequest.getSession();
			Role role = roleService.queryAllRolesByroNo(roNo);
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("httpSession",httpSession);
			modelAndView.addObject("role",role);
			modelAndView.addObject("mainPage", "role/updateRole.jsp");
			modelAndView.setViewName("adminMain");
			return modelAndView;
		}
					
					
					
					
		//快递员插入
		@RequestMapping(value = "/add",produces = {"text/html;charset=utf-8"})
		public String courierAdd(Role role,HttpSession httpSession) {
			roleService.insertSelective(role);
			return "redirect: roleTable";

		}
					
		//快递员信息更新
		@RequestMapping(value = "/update",produces = {"text/html;charset=utf-8"})
		public String updateCourier(Role role,HttpServletRequest httpServletRequest) {
			roleService.updateByPrimaryKeySelective(role);
			return "redirect: roleTable";
		}
	
	
}
