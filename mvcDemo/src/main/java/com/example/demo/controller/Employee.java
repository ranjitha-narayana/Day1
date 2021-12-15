package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Employee {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int id;
	String name;
	String desig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("id is "+this.id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig + "]";
	}
	

}
