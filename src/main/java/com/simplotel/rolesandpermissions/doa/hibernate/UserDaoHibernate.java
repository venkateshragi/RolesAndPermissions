package com.simplotel.rolesandpermissions.doa.hibernate;

import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.UserDao;
import com.simplotel.rolesandpermissions.domain.User;

@Repository("userDao")
public class UserDaoHibernate extends GenericDaoHibernate<User> implements UserDao{

	public UserDaoHibernate() {
		super(User.class);
	}


}
