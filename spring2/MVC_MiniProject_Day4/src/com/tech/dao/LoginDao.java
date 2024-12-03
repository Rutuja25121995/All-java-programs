package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.tech.dto.User;

//@Controller
@Repository
public class LoginDao {
	public LoginDao() {
		System.out.println("inside LoginDao constructor");
	}

	@Autowired
	SessionFactory sessionFactory;

	public boolean validateUserinDB(String username, String password) {
		// select * From user_db where username ='admin' and password
		// ='admin123'
		System.out.println("inside LoginDao.validateUserinDB");
		Session session = sessionFactory.openSession();

		Criteria cr = session.createCriteria(User.class);
		Criterion cr1 = Restrictions.eq("username", username);
		Criterion cr2 = Restrictions.eq("password", password);
		cr.add(cr1);
		cr.add(cr2);

		User userfromDB = (User) cr.uniqueResult();
		
		if (userfromDB == null) {
			System.out.println("records is not present in db");
			return false;
		} else {
			System.out.println("records is  present in db");
			return true;
		}

		
	}

	public boolean validateUser(String username, String password) {
		System.out.println("insid LoginDao.validateUser");
		if (username.equals("admin") && password.equals("admin123")) {
			System.out.println("user present in DB");
			return true;
		} else {
			System.out.println("user not present in DB");
			return false;
		}
	}

	public void createUser() {
		System.out.println("inside LoginDao.createUser() ");
	}

	public void updateUser() {
		System.out.println("inside LoginDao.updateUser() ");
	}

	public void deleteUser() {
		System.out.println("inside LoginDao.deleteUser() ");
	}

	public void getALl() {
		System.out.println("inside LoginDao.getALl() ");
	}
}
