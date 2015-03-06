package com.simplotel.rolesandpermissions.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplotel.rolesandpermissions.domain.Role;
import com.simplotel.rolesandpermissions.service.PermissionService;
import com.simplotel.rolesandpermissions.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	PermissionService permissionService;
	
	@RequestMapping("/all")
	public ModelAndView allRole(){
		List<Role> allRoles = roleService.getAll();
		ModelAndView mav = new ModelAndView("roles");
		mav.addObject("roles", allRoles);
		return mav;
	}

	@RequestMapping("/add")
	public ModelAndView addRole(){
		ModelAndView mav = new ModelAndView("add_role");
		mav.addObject("permissions", permissionService.getAll());
		return mav;
	}

	@PreAuthorize("hasRole('CREATE_ROLE')")
	@RequestMapping("/save")
	public String createRole(HttpServletRequest request){
		String roleName = request.getParameter("roleName");
		String[] permissions = request.getParameterValues("permissions");
		if(permissions == null)
			permissions = new String[0];
		roleService.createRole(roleName, permissions);
		return "redirect:/app/role/add";
	}
}
