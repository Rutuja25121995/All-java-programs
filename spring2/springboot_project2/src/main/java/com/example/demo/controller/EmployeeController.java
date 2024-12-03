package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {

	public EmployeeController() {
		System.out.println("inside EmployeeController constructor");
	}
	@RequestMapping("/getname")
	public String getName(@RequestParam ("name") String name) {
		System.out.println("inside getName()-->"+name);
		return "hello "+name;
	}
}
