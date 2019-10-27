package com.loginregistrationjpa.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.loginregistrationjpa.model.User;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Long> {
	@Query(value = "select * from user where username = ? and password = ?", nativeQuery = true)
List<User>findbyUsersandPassword(String username, String password) ;
}
