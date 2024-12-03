package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginService;

@Controller
public class LoginContoller {

	public LoginContoller() {
		System.out.println("inside Logincontroller constructor");
	}

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public ModelAndView validateUser(@RequestParam("uname") String username, @RequestParam("pass") String password) {
		System.out.println("username--->" + username);
		System.out.println("password--->" + password);
		boolean result = loginService.validateUser(username, password);
		System.out.println("the response from loginService.validateUser is :" + result);

		if (result) {
			ModelAndView mav = new ModelAndView("login_success");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("login_failure");
			return mav;
		}
	}
}
