package com.simplotel.rolesandpermissions.doa.hibernate;

import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.RoleDao;
import com.simplotel.rolesandpermissions.domain.Role;

@Repository("roleDao")
public class RolesDaoHibernate extends GenericDaoHibernate<Role> implements RoleDao{

	public RolesDaoHibernate() {
		super(Role.class);
	}

}
