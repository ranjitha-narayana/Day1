package com.example.demo.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudnetService;

@RestController
public class StudentController {

	@Autowired
	StudnetService service;
	
	@PostMapping( value = "/saveStd" ,consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_XML_VALUE )
	public ResponseEntity<Student> print(@RequestBody Student std)
	{	
		service.store(std);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	
	@GetMapping( value = "/Students" ,produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Student>> getStds()
	{	
		List<Student> list=service.getStudents();
		return new ResponseEntity<List<Student>>(list,HttpStatus.CREATED);
	}
	
	@GetMapping( value = "/Student/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Student> getStd(@PathVariable("id") int id)
	{	
		Student std=service.getStudent(id);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	
	@PutMapping( value = "/Student" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> updateStd(@RequestBody Student std)
	{	
		service.store(std);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	
	@DeleteMapping( value = "/delete/{id}" ,consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int id)
	{	
		service.deleteStd(id);
		return new ResponseEntity<String>("recored deleted",HttpStatus.CREATED);
	}
	
	
	
	
}


//crud :  create ,read  , update , delete
//        post    ,get   , put    ,delete 