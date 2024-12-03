package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.tech.dao.LoginDao;

//@Controller
@Service
public class LoginService {

	public LoginService() {
		System.out.println("inside LoginService constructor");
	}

	@Autowired
	private LoginDao loginDao;

	public boolean validateUser(String uname, String pass) {
		System.out.println("inside LoginService.validateUser");

		// LoginDao logindao = new LoginDao();
		//boolean validateUser = loginDao.validateUser(uname, pass);
		boolean validateUser = loginDao.validateUserinDB(uname, pass);
		
		System.out.println("the response from logindao.validateUser is :" + validateUser);
		return validateUser;

	}

	public void createUser() {
		System.out.println("inside LoginService.createUser()");

		// LoginDao loginDao = new LoginDao();
		loginDao.createUser();
	}

	public void updateUser() {
		System.out.println("inside LoginService.updateUser()");
		// LoginDao loginDao = new LoginDao();
		loginDao.updateUser();
	}

	public void deleteUser() {
		System.out.println("inside LoginService.deleteUser()");
		// LoginDao loginDao = new LoginDao();
		loginDao.deleteUser();
	}

}
