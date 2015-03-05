package com.simplotel.rolesandpermissions.doa.hibernate;

import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.PermissionDao;
import com.simplotel.rolesandpermissions.domain.Permission;

@Repository("permissionDao")
public class PermissionDaoHibernate extends GenericDaoHibernate<Permission> implements PermissionDao{

	public PermissionDaoHibernate() {
		super(Permission.class);
	}

}
