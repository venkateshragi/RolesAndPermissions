package com.simplotel.rolesandpermissions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplotel.rolesandpermissions.doa.ResourcesDao;
import com.simplotel.rolesandpermissions.domain.Resource;
import com.simplotel.rolesandpermissions.domain.ResourceType;
import com.simplotel.rolesandpermissions.service.ResourceService;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	ResourcesDao resourcesDao;

	public Resource createResource(String name, ResourceType resourceType) {
		Resource resource = new Resource();
		resource.setName(name);
		resource.setResourceType(resourceType);
		return (Resource) resourcesDao.save(resource);
	}

	public List<Resource> getAll() {
		return resourcesDao.getAll();
	}

}
