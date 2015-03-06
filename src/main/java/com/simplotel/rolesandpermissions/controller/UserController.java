package com.simplotel.rolesandpermissions.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplotel.rolesandpermissions.service.RoleService;
import com.simplotel.rolesandpermissions.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;

	@PreAuthorize("hasRole('CREATE_USER')")
	@RequestMapping("/add")
	public String addUser(){
		return "add_user";
	}
	
	@PreAuthorize("hasRole('CREATE_USER')")
	@RequestMapping("/save")
	public String saveUser(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		if(hasPermission(request, PermissionType.CREATE, ResourceType.USER)){
			userService.createUser(username, password);
//		}
		return "redirect:/app/user/add";
	}
	
	@PreAuthorize("hasRole('ASSIGN_ROLE')")
	@RequestMapping("/assignRole")
	public ModelAndView assignRole() {
		ModelAndView mav = new ModelAndView("assign_role");
		mav.addObject("users", userService.getAll());
		mav.addObject("roles", roleService.getAll());
		return mav;
	}
	
	@PreAuthorize("hasRole('ASSIGN_ROLE')")
	@RequestMapping("/assign")
	public String assignRole(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String roleId = request.getParameter("roleId");
		userService.assignRole(Long.parseLong(userId), Long.parseLong(roleId));
		return "redirect:/app/user/add";
	}
}
