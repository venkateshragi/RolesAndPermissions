package com.simplotel.rolesandpermissions.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import com.simplotel.rolesandpermissions.domain.Permission;
import com.simplotel.rolesandpermissions.domain.PermissionType;
import com.simplotel.rolesandpermissions.domain.ResourceType;
import com.simplotel.rolesandpermissions.domain.Role;

public class BaseController {
	
	protected boolean hasPermission(HttpServletRequest request, PermissionType permissionType, ResourceType reqourceType){
		User loggedInUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		for(GrantedAuthority authority : loggedInUser.getAuthorities()){
			Role role = (Role)authority;
			for(Permission permission : role.getPermissions()) {
				if(permission.getPermissionType().equals(permissionType) && permission.getResourceType().equals(reqourceType))
					return true;
			}
		}
		return false;
	}
}
