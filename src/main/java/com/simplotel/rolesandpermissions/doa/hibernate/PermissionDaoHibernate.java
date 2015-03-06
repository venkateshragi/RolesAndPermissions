package com.simplotel.rolesandpermissions.doa.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.PermissionDao;
import com.simplotel.rolesandpermissions.domain.Permission;

@Repository("permissionDao")
public class PermissionDaoHibernate extends GenericDaoHibernate<Permission> implements PermissionDao{

	public PermissionDaoHibernate() {
		super(Permission.class);
	}
	
	public List<Permission> getPermissions(String[] permissionIds){
		Criteria criteria = createCriteria().add(Restrictions.in("ID", permissionIds));
		return criteria.list();
		
	}

}
