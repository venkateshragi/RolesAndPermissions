package com.simplotel.rolesandpermissions.doa.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.simplotel.rolesandpermissions.doa.GenericDao;

public abstract class GenericDaoHibernate<T> implements GenericDao<T>{
	
	@Autowired
    private SessionFactory sessionFactory;	
	
	private Class<T> type;
	
	public GenericDaoHibernate(Class<T> type) {
		this.type = type;
	}
	
	protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	public T get(int id) {
        return (T) getSession().get(type, id);
    }
    
    public List<T> getAll() {
        return (List<T>) (getSession().createQuery("from " + type.getName() + " x").list());
    }
    
    public Serializable save(T object) {
        return getSession().save(object);
    }

}
