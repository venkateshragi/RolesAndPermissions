package com.simplotel.rolesandpermissions.doa.hibernate;

import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.RolesDao;
import com.simplotel.rolesandpermissions.domain.Role;

@Repository("roleDao")
public class RolesDaoHibernate extends GenericDaoHibernate<Role> implements RolesDao{

	public RolesDaoHibernate() {
		super(Role.class);
	}

}
