package com.simplotel.rolesandpermissions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplotel.rolesandpermissions.doa.RoleDao;
import com.simplotel.rolesandpermissions.doa.UserDao;
import com.simplotel.rolesandpermissions.domain.Role;
import com.simplotel.rolesandpermissions.domain.User;
import com.simplotel.rolesandpermissions.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userdao;
	
	@Autowired
	RoleDao roleDao;

	public void saveOrUpdateUser(User user) {
	}

	public User findByUsername(String username) {
		return userdao.findByUsername(username);
	}
	
	public User createUser(String username, String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		long id = (Long) userdao.save(user);
		return userdao.get(id);
	}
	
	public void assignRole(long userId, long roleId) {
		User user = userdao.get(userId);
		Role role = roleDao.get(roleId);
		user.getRoles().add(role);
		userdao.save(user);
	}
	
	public List<User> getAll(){
		return userdao.getAll();
	}

}
