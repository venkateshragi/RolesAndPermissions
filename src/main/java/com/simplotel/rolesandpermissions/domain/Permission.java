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
	
	@Column(name = "PERMISSION_TYPE")
	PermissionType permissionType;
	
	@Column(name = "RESOURCE_TYPE")
	ResourceType resourceType;

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

	public PermissionType getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(PermissionType permissionType) {
		this.permissionType = permissionType;
	}

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

}
