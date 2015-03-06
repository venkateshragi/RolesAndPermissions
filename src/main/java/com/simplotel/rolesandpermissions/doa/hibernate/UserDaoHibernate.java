package com.simplotel.rolesandpermissions.doa.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.simplotel.rolesandpermissions.doa.UserDao;
import com.simplotel.rolesandpermissions.domain.User;

@Repository("userDao")
public class UserDaoHibernate extends GenericDaoHibernate<User> implements UserDao{

	public UserDaoHibernate() {
		super(User.class);
	}

	public User findByUsername(String username) {
		Criteria criteria = createCriteria();
		criteria.add(Restrictions.eq("username", username));
		return (User) criteria.uniqueResult();
	}


}
