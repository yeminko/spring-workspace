package com.example.restwithjwt.helper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.example.restwithjwt.entities.User;
import com.example.restwithjwt.entities.UserPrincipal;

public class UserMapper {
	
	public static UserPrincipal userToPrincipal(User user) {
		UserPrincipal userp = new UserPrincipal();
		List<SimpleGrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName())).collect(Collectors.toList());

		userp.setUsername(user.getUsername());
		userp.setPassword(user.getPassword());
		userp.setEnabled(user.isEnabled());
		userp.setAuthorities(authorities);
		return userp;
	}
}
