package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentProducerController {

	
	public StudentProducerController() {
	System.out.println("inside StudentProducerController cons");
	
	}
	
	@RequestMapping("/getName")
	public String getName()
	{
		System.out.println("inside producer-getName");
		return "hi developer from producer";
	}
	

	@GetMapping("/getName1")
	public String getName1()
	{
		System.out.println("inside producer-getName1");
		return "hi developer from producer1";
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent()
	{
		System.out.println("inside producer-getAllStudent()");
	 List<Student> stdlist = new ArrayList<>();
	 	Student s1 =new Student("ms", "dhoni", "ms@gmail.com");
	 	Student s2 =new Student("virat", "kohli", "virat@gmail.com");
	 	Student s3 =new Student("rohit", "sharma", "rohit@gmail.com");
	 	
	 	stdlist.add(s1);
	 	stdlist.add(s2);
	 	stdlist.add(s3);
	 	
	 	return stdlist;
	 	
	 
	}
}
