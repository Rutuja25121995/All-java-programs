package com.tech.dao;

import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	public LoginDao() {
		System.out.println("inside LoginDao constructor");

	}

	public boolean validateUser(String username, String password) {
		if (username.equals("rutuja") && password.equals("rutuja123")) {
			System.out.println("record present in database");
			return true;
		} else {
			System.out.println("record not present in database");
			return false;
		}

	}
}
