package com.simplotel.rolesandpermissions.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException, DataAccessException {

		if (!username.equals("admin")) {
			throw new UsernameNotFoundException(username + " not found");
		}

		return new UserDetails() {

			private static final long serialVersionUID = 2059202961588104658L;

			public boolean isEnabled() {
				return true;
			}

			public boolean isCredentialsNonExpired() {
				return true;
			}

			public boolean isAccountNonLocked() {
				return true;
			}

			public boolean isAccountNonExpired() {
				return true;
			}

			public String getUsername() {
				return username;
			}

			public String getPassword() {
				return "admin";
			}

			public Collection<GrantedAuthority> getAuthorities() {
				List<GrantedAuthorityImpl> auths = new ArrayList<GrantedAuthorityImpl>();
				auths.add(new GrantedAuthorityImpl("Admin"));
				return (Collection) auths;
			}
		};

	}

}
