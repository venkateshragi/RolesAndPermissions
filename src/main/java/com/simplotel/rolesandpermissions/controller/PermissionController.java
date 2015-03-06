package com.simplotel.rolesandpermissions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplotel.rolesandpermissions.domain.Permission;
import com.simplotel.rolesandpermissions.service.PermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	
	@Autowired
	PermissionService permissionService;
	
	@RequestMapping("/all")
	public ModelAndView allPermission(){
		List<Permission> allPermissions = permissionService.getAll();
		ModelAndView mav = new ModelAndView("permissions");
		mav.addObject("permissions", allPermissions);
		return mav;
	}

}
