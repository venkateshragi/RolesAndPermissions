package com.simplotel.rolesandpermissions.doa.hibernate;

import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.ResourcesDao;
import com.simplotel.rolesandpermissions.domain.Resource;

@Repository("resourceDao")
public class ResourceDaoHibernate extends GenericDaoHibernate<Resource> implements ResourcesDao{

	public ResourceDaoHibernate() {
		super(Resource.class);
	}

}
