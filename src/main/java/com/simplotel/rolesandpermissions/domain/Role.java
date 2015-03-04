package com.simplotel.rolesandpermissions.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {
	
	String roleName;
	
	Set<Permission> permissions = new HashSet<Permission>();

}
