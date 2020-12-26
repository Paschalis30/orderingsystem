package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Interface_Salad extends JpaRepository<Salad,Integer>{
	

List<Salad> findById(int id);

List<Salad> findByName(String name);//select * from Salad where Salad.name={}
}
