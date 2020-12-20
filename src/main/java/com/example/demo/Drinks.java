package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Drinks")
public class Drinks {
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
		return "Drinks [name=" + name + ", priceUnit=" + priceUnit + ", Qty=" + Qty + "]";
	}
}
