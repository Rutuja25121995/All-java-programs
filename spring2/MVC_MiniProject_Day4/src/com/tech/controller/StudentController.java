package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.service.StudentService;

@Controller
public class StudentController {

	public StudentController() {
	System.out.println("inside StudentController construtor");
	}
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/getALL")
	public String getAll()
	{
		studentService.getALL();
		
		return "student-getall";
	}
	@RequestMapping("/update1")
	public String updateStduent()
	{
		studentService.updateStudent();
		return "student-update";
		
	}
}
