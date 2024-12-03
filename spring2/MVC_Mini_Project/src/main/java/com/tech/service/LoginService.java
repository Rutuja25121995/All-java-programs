package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;

@Service
public class LoginService {
	public LoginService() {
		System.out.println("inside Loginservice constructor");
	}

	@Autowired
	private LoginDao loginDao;

	public boolean validateUser(String username, String password) {
		boolean validateUser = loginDao.validateUser(username, password);
		return validateUser;
	}
}
