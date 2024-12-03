package com.tech.service;

import com.tech.dao.LoginDaoController;

public class LoginServiceController {

	public LoginServiceController() {
		System.out.println("inside LoginServiceController constructor");
	}

	public boolean validateUser(String username, String password) {
		
		LoginDaoController logindao=new LoginDaoController();
		boolean validateuser=logindao.validate(username, password);
		System.out.println("response from login validate --->"+validateuser);
		return validateuser;
	}
}
