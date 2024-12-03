package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.Login_Service;

@Controller
public class Login_Controller {

	public Login_Controller() {
		System.out.println("inside Login_Controller constructor");
	}
	@Autowired
	Login_Service login_service;
	

	@RequestMapping("/login")
	public ModelAndView validateUser(@RequestParam("uname") String username, @RequestParam("pass") String password) {
		System.out.println("inside validateuser method");
		System.out.println(username + "-----" + password);

		
		boolean result = login_service.validateUser(username, password);
		System.out.println("the response from login_service.validateUser is :" + result);

		if (result) {
			ModelAndView mav = new ModelAndView("success");
			mav.addObject("USER", username);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("failure");
			mav.addObject("USER", username);
			return mav;
		}

	}

}
