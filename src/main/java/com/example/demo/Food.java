package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Drinks")
public class Food {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO) 
	int id;
	@Column(name="name")
	String name;
	@Column(name="priceUnit")
	double priceUnit;
	int Qty;

}
