package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login_controller {

	public Login_controller() {
		System.out.println("inside Login_controller constructor");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView validate(@RequestParam("username") String username, @RequestParam("password") String password) {
		    
		System.out.println("inside validate method");
		    System.out.println(username);
		    System.out.println(password);
		if (username.equals("rutuja") && password.equals("1111")) {
			
			System.out.println("success case");
			
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("USERNAME", username);
			
			return mav;
			
		} else {
			System.out.println("failure case");
			
			ModelAndView mav = new ModelAndView("failure");
			mav.addObject("USERNAME", username);
			
			return mav;
		}
	}
}
