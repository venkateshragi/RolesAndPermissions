package com.simplotel.rolesandpermissions.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	String username;
	
	Set<Role> roles = new HashSet<Role>();
	
}
