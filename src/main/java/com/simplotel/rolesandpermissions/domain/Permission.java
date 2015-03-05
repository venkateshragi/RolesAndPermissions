package com.simplotel.rolesandpermissions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERMISSION")
public class Permission {
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

	@Column(name="PERMISSION_NAME")
	String name;
	
}
