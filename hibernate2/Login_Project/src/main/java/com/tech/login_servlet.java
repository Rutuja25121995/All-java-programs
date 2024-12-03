package com.tech;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;



public class login_servlet extends HttpServlet {

	public login_servlet() {
		System.out.println("inside constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("uname");
		String password = req.getParameter("password");

		System.out.println(username);
		System.out.println(password);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate-cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		

		Criteria cr = session.createCriteria(student.class);
		
		Criterion criterion1 = Restrictions.eq("username",username);
		Criterion criterion2 = Restrictions.eq("password",password);

		cr.add(criterion1);
		cr.add(criterion2);
		
		System.out.println(cr);
		
		student student= (student) cr.uniqueResult();
		System.out.println("records from database ---->" + student);
			if(student!=null)
			{
				System.out.println("success case");
				RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
				rd.forward(req, resp);
			}else {
				System.out.println("failure case");
				RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
				rd.forward(req, resp);
				
			}
			
		}
		
	}


