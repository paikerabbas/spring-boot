package com.saien.springbootone;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("user----------------");
		System.out.println(username);
		Optional<UserVO> userOptional = repo.findUserByUsername(username);
		System.out.println("user details--------------");
		System.out.println(userOptional);
		// implement the authentication based on password also as it is not working with
		// password sometime it works some times it does't
		UserVO userInDb = userOptional.orElseThrow(() -> new UsernameNotFoundException("Not Found in DB"));
		return new CustomUserDetails(userInDb);
	}

}
