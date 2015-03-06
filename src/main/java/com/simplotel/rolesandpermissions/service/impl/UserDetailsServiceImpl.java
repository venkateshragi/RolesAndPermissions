package com.simplotel.rolesandpermissions.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simplotel.rolesandpermissions.domain.User;
import com.simplotel.rolesandpermissions.service.UserService;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserService userService;	

	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException, DataAccessException {
		
		User user = userService.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(username + " not found");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true, true, true, true, (Collection)user.getRoles());
	}

}
