package com.simplotel.rolesandpermissions.doa;

import java.util.List;

public interface GenericDao<T> {
	
	public List<T> getAll();
	
	public T save(T object);

	T get(int id);

}
