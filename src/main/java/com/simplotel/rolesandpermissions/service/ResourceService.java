package com.simplotel.rolesandpermissions.service;

import java.util.List;

import com.simplotel.rolesandpermissions.domain.Resource;
import com.simplotel.rolesandpermissions.domain.ResourceType;

public interface ResourceService {

	Resource createResource(String name, ResourceType resourceType);
	
	List<Resource> getAll();
}
