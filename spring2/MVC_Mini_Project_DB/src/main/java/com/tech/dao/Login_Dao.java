package com.tech.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.dto.User;
@Repository
public class Login_Dao {

	public Login_Dao() {
		System.out.println("inside Login_Dao constructor");
	}
	@Autowired
	SessionFactory sessionFactory;
	public boolean validateUser(String username,String password) {
		System.out.println("inside Login_Dao.validateUser");
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(User.class);
		Criterion cr1 = Restrictions.eq("username", username);
		Criterion cr2 = Restrictions.eq("password", password);
		cr.add(cr1);
		cr.add(cr2);
		User userfromDB = (User) cr.uniqueResult();
		if (userfromDB != null) {
			System.out.println("records is  present in db");
			return true;
		} else {
			System.out.println("records is not present in db");
			return false;
		}
	
	}

}
