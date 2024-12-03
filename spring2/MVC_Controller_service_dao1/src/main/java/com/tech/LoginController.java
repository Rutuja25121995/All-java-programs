package com.tech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tech.service.LoginServiceController;

@Controller
public class LoginController {

	public LoginController() {
		
		System.out.println("inside LoginController constructor");
	}

	@RequestMapping("/login")
	public ModelAndView validate(@RequestParam("uname") String username, 
			@RequestParam("pass") String password) {
		
		LoginServiceController loginservice = new LoginServiceController();
		
		boolean result = loginservice.validateUser(username, password);
		
		System.out.println("response from loginservice.validateUser "+result);
		
		if (result) {
			ModelAndView mav = new ModelAndView("login_success");
			return mav;
		}
		else {
			ModelAndView mav = new ModelAndView("login_failure");
			return mav;
		}
	}
}
