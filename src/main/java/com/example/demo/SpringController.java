package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

@CrossOrigin(origins="*",allowedHeaders={"*"})
@RestController
public class SpringController {
	
	
	@Autowired
	Interface_Drinks drinks;
	@Autowired
	Interface_Salad salad;
	@Autowired
	Interface_Paragelia paragelia;
	@Autowired
	Interface_Food food;
	
	@JsonIgnore
	@GetMapping("/allsalads")
	public Iterable<Salad> getSalad(){
		return  salad.findAll();
	}
	
}