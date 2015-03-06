package com.simplotel.rolesandpermissions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplotel.rolesandpermissions.doa.PermissionDao;
import com.simplotel.rolesandpermissions.domain.Permission;
import com.simplotel.rolesandpermissions.service.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService{
	
	@Autowired
	PermissionDao permissionDao;
	
	public List<Permission> getAll(){
		return permissionDao.getAll();
	}

}
