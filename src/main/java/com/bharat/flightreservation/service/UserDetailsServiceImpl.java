package com.bharat.flightreservation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.bharat.flightreservation.entities.User;
import com.bharat.flightreservation.repos.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepositoy;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepositoy.findByEMAIL(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		
		
		return new org.springframework.security.core.userdetails.User(user.getEMAIL(),user.getPASSWORD(), user.getRoles());
	}

}
