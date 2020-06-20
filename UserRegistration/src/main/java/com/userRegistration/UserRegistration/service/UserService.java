package com.userRegistration.UserRegistration.service;

import com.userRegistration.UserRegistration.model.User;

public interface UserService {
	 void save(User user);
	 
	 User findByUsername(String username);
}
