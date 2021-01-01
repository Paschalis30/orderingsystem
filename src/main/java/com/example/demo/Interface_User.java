package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Interface_User extends JpaRepository<User,Integer>{

	List<User>findByUsernameAndPassword(String username,int password);
	
}
