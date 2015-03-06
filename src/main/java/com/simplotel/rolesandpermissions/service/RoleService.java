package com.simplotel.rolesandpermissions.service;

import java.util.List;

import com.simplotel.rolesandpermissions.domain.Role;

public interface RoleService {
	
	List<Role> getAll();

	Role createRole(String roleName, String[] permissionIds);

}
