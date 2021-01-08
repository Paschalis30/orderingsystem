package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
public interface Interface_Salad extends JpaRepository<Salad,Integer>{
	

List<Salad> findById(int id);

List<Salad> findByName(String name);//select * from Salad where Salad.name={}

@Query("select Salad.name,Salad.Qty from Salad Salad where Salad.id=0")
List<Object>findByPriceUnitAndName(double priceUnit,String name);

//@Query("select Salad.name from Salad Salad,User User where User.id=Salad.id")
//List<Object>findByRole(String role);
}
