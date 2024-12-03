package com.tech.dao;

public class LoginDaoController {

	public LoginDaoController() {
		System.out.println("inside LoginDaoController constructor");
	}

	public boolean validate(String username, String password) {            
		System.out.println("inside validate method");

		if (username.equals("rutuja") && password.equals("1111")) {
			System.out.println("record present in database");
			return true;

		} else {
			System.out.println("record not present in database");
			return false;
		}
	}
}
