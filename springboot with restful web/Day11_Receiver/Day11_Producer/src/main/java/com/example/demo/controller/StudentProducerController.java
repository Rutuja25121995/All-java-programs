package com.example.demo.controller;

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
}
