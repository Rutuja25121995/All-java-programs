package com.tech.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginService;

@Controller
public class LoginController {

	public LoginController() {
		System.out.println("inside LoginController constructor");
	}

	@Autowired
	LoginService loginService;

	@RequestMapping("/login")
	public ModelAndView validateUser(@RequestParam("uname") String uname, @RequestParam("pass") String pass) {
		System.out.println("inside validateuser method");
		System.out.println(uname + "-----" + pass);

		// LoginService loginService= new LoginService();
		boolean result = loginService.validateUser(uname, pass);
		System.out.println("the response from loginService.validateUser is :" + result);

		if (result) {
			ModelAndView mav = new ModelAndView("login-success");
			mav.addObject("USER", uname);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("login-failure");
			mav.addObject("USER", uname);
			return mav;
		}

	}

	@RequestMapping("/create")
	public String createuser() {
		System.out.println("inside createuser method controller ");

		loginService.createUser();
		//ModelAndView mav = new ModelAndView("create-success");
		//return mav;
		return "create-success";
	}

	@RequestMapping("/update")
	public String updateuser() {
		System.out.println("inside updateuser method controller ");
		loginService.updateUser();
		return "update-success";
	}

	@RequestMapping("/delete")
	public String deleteUser() {
		System.out.println("inside deleteUser method controller ");
		loginService.deleteUser();
		return "delete-success";
	}
}

// if admin and admin123 to success else failure
//
