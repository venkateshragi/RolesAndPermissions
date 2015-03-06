package com.simplotel.rolesandpermissions.service;

import java.util.List;

import com.simplotel.rolesandpermissions.domain.User;

public interface UserService {
	
	public void saveOrUpdateUser(User user);
	
	public User findByUsername(String username);
	
	public User createUser(String username, String password);
	
	public void assignRole(long userId, long roleId);
	
	public List<User> getAll();

}
