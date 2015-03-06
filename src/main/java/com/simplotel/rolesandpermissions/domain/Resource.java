package com.simplotel.rolesandpermissions.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RESOURCE")
public class Resource {
	
	@Id
    @GeneratedValue
    @Column(name = "ID")
    long id;
	
	@Column(name="RESOURCE_NAME")
	String name;

	@Enumerated(EnumType.STRING)
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

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

}
