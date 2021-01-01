package com.example.demo;


import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	Interface_User user;
	@Autowired
	Interface_Food food;
	
	@JsonIgnore
	@GetMapping("/allsalads")
	public Iterable<Salad> getSalad(){
		return  salad.findAll(); //select * from salad
	}
	
	@JsonIgnore
	@GetMapping("/allParagelies")
	public Iterable<Paragelia> getParagelia(){
		return  paragelia.findAll(); //select * from salad
	}
	
	@JsonIgnore
	@GetMapping({ "/findById/{id}" })
	public List<Salad> findByQty(@PathVariable int id) {
		
		return salad.findById(id);
	}
	
	@JsonIgnore
	@GetMapping({ "/findByName/{name}" })
	public List<Salad> getName(@PathVariable String name) {
		
		return salad.findByName(name);
	}
	
	
	@GetMapping("/")
	public String login(){
		return "authenticated successfully" ;
	}
	@JsonIgnore
	@PostMapping("/register")
	public  String User(@RequestBody User User) {
		user.save(User);
		return "User"+" "+User.getUsername()+" ,have successfully submitted";
		
	}
	
//	@JsonIgnore
//	@GetMapping({ "/User/{username}/{password}" })
//	public List<User> login(@PathVariable String username,@PathVariable int password) {
//		
//		return user.findByUsernameAndPassword(username, password);
//	}
	
	 
	
}