package com.rest.webservice.restwebservice.jpa;

import com.rest.webservice.restwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
