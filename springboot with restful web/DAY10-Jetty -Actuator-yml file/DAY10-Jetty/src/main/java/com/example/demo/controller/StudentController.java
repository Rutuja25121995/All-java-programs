package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	public StudentController() {
	System.out.println("inside StudentController cons ");
	}

	@GetMapping("/hi")
	public String getName()
	{
		return "hi -developer";
	}
}
