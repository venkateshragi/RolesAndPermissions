package com.simplotel.rolesandpermissions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplotel.rolesandpermissions.doa.UserDao;
import com.simplotel.rolesandpermissions.domain.User;
import com.simplotel.rolesandpermissions.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userdao;

	public void saveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findByUsername(String username) {
		return userdao.findByUsername(username);
	}

}
