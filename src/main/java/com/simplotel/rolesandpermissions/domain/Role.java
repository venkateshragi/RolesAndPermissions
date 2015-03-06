package com.simplotel.rolesandpermissions.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="ROLE")
public class Role implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name = "ID")
    long id;
	
	@Column(name="ROLE_NAME")
	String roleName;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ROLE_PERMISSION", joinColumns = @JoinColumn(name = "ROLE_ID"), inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID"))
	Set<Permission> permissions = new HashSet<Permission>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public String getAuthority() {
		return roleName;
	}


}
