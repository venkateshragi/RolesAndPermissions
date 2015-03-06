package com.simplotel.rolesandpermissions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="PERMISSION")
public class Permission implements GrantedAuthority{
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

	@Column(name="PERMISSION_NAME")
	String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return name;
	}

}
