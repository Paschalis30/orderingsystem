package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food")
public class Food {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO) 
	int id;
	@Column(name="name")
	String name;
	@Column(name="priceUnit")
	double priceUnit;
	@Column(name="Qty")
	int Qty;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(double priceUnit) {
		this.priceUnit = priceUnit;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", priceUnit=" + priceUnit + ", Qty=" + Qty + "]";
	}
	
	
	
	

}
