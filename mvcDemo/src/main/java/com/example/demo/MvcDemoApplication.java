package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MvcDemoApplication{

	public static void main(String[] args){
		SpringApplication.run(MvcDemoApplication.class, args);
//		 ConfigurableApplicationContext context= SpringApplication.run(MvcDemoApplication.class, args);
//	
//		 Student std=(Student) context.getBean("student");
//		 std.userName();
		 
	}

}
