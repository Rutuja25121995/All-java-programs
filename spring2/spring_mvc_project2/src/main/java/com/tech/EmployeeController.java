package com.tech;

import org.springframework.web.servlet.ModelAndView;

public class EmployeeController {

	public EmployeeController() {
		System.out.println("inside constructor");
	}

	public ModelAndView validate() {
		System.out.println("inside validate method");
		ModelAndView mav = new ModelAndView("success1");
		return mav;
	}
}
