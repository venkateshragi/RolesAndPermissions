package com.simplotel.rolesandpermissions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplotel.rolesandpermissions.doa.PermissionDao;
import com.simplotel.rolesandpermissions.doa.RoleDao;
import com.simplotel.rolesandpermissions.domain.Permission;
import com.simplotel.rolesandpermissions.domain.Role;
import com.simplotel.rolesandpermissions.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	PermissionDao permissionDao;
	
	public List<Role> getAll() {
		return roleDao.getAll();
	}
	
	public Role createRole(String roleName, String[] permissionIds){
		List<Permission> permissions = permissionDao.getPermissions(permissionIds);
		Role role = new Role();
		role.setRoleName(roleName);
		role.getPermissions().addAll(permissions);
		long id = (Long) roleDao.save(role);
		return roleDao.get(id);
	}

}
