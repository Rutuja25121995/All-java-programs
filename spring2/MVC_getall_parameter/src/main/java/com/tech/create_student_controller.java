package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class create_student_controller {

	public create_student_controller() {
		System.out.println("inside create_student_controller constructor");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView create_student(@RequestParam("fname")String firstname,
			@RequestParam("lname")String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
		ModelAndView mav=new ModelAndView("create_success");
		mav.addObject("FIRSTNAME",firstname);
		mav.addObject("LASTNAME",lastname);
		return mav;
	}
	
}
