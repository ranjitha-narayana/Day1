package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired
	EmpRepo repo;
	public void saveEmp(Employee emp) 
	{
		repo.save(emp);
	}
	public List<Employee> getEmployees() {
		
		List<Employee> list=repo.findAll();
		return list;
	}
	public void deleteEmp(int id) {
		repo.deleteById(id);
		
	}

}
