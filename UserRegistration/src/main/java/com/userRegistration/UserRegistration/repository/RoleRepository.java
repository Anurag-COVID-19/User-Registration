package com.userRegistration.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.userRegistration.UserRegistration.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
