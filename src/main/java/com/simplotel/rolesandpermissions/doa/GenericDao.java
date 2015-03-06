package com.simplotel.rolesandpermissions.doa;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T> {
	
	public List<T> getAll();
	
	public Serializable save(T object);

	T get(long id);

}
