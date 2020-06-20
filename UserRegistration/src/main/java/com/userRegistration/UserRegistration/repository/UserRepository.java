package com.userRegistration.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userRegistration.UserRegistration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
