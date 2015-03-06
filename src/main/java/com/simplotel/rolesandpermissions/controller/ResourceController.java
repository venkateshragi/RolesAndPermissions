package com.simplotel.rolesandpermissions.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplotel.rolesandpermissions.domain.PermissionType;
import com.simplotel.rolesandpermissions.domain.Resource;
import com.simplotel.rolesandpermissions.domain.ResourceType;
import com.simplotel.rolesandpermissions.service.ResourceService;

@Controller
@RequestMapping("/resource")
public class ResourceController extends BaseController{
	
	@Autowired
	ResourceService resourceService;
	
	@RequestMapping("/add")
	public ModelAndView addResource(){
		List<Resource> allResources = resourceService.getAll();
		ModelAndView mav = new ModelAndView("add_resource");
		mav.addObject("resources", allResources);
		return mav;
	}
	
	@RequestMapping("/save")
	@PreAuthorize("hasRole('Admin')")
	public String save(HttpServletRequest request){
		String resourceName = request.getParameter("name");
		String resourceType = request.getParameter("type");
		if(hasPermission(request, PermissionType.CREATE, ResourceType.valueOf(resourceType))){
			resourceService.createResource(resourceName, ResourceType.valueOf(resourceType));
		}
		return "add_resource";
	}

}
