package com.simplotel.rolesandpermissions.doa;

import java.util.List;

import com.simplotel.rolesandpermissions.domain.Permission;

public interface PermissionDao extends GenericDao<Permission>{
	
	public List<Permission> getPermissions(String[] permissionIds);

}
