package com.simplotel.rolesandpermissions.doa;

import com.simplotel.rolesandpermissions.domain.User;

public interface UserDao extends GenericDao<User>{
	
	public User findByUsername(String username);

}