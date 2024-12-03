package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("inside LoginController constructor");
	}

	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("validate method");
		System.out.println(username + " " + password);
		if (username.equals("rutuja") && password.equals("1111")) {
			System.out.println("login successful");
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("USERNAME", username);
			return mav;
		} else {
			System.out.println("login unsuccessful");
			ModelAndView mav = new ModelAndView("failure");
			mav.addObject("USERNAME", username);

			return mav;
		}
	}

	@RequestMapping("/create")
	public ModelAndView create_student(@RequestParam("fname") String firstname,
			@RequestParam("lname") String lastname) {
		ModelAndView mav1 = new ModelAndView("success_student");
		mav1.addObject("firstname", firstname);
		mav1.addObject("lastname", lastname);
		return mav1;

	}
}
