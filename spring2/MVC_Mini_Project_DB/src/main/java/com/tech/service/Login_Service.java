package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.Login_Dao;

@Service
public class Login_Service {

	public Login_Service() {
		System.out.println("inside Login_Service constructor");
	}

	@Autowired
	 Login_Dao login_dao;

	public boolean validateUser(String username, String password) {
		boolean validateUser = login_dao.validateUser(username, password);
		return validateUser;

	}
}
