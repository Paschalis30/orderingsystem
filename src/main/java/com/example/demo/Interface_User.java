package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Interface_User extends JpaRepository<User,Integer>{

	List<User>findByUsernameAndPasswordAndRole(String username,int password,String role);
	List<User> findByUsername(String username);
}
