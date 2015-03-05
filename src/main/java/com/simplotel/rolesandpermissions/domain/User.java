package com.simplotel.rolesandpermissions.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
    long id;
	
	@Column(name="USERNAME")
	String username;
	
	@Column(name = "PASSWORD")
	String password;
	
	@ManyToMany
	@JoinTable(name="USER_ROLE", joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="ROLE_ID"))
	Set<Role> roles = new HashSet<Role>();
	
}
