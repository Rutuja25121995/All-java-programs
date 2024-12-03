package com.tech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class create_Servlet extends HttpServlet {

	public create_Servlet() {
		System.out.println("inside create_student constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String firstname=req.getParameter("fname");
      String lastname=req.getParameter("lname");
      String email=req.getParameter("email");
      System.out.println(firstname);
      System.out.println(lastname);
      System.out.println(email);
      
      req.setAttribute("firstname", firstname);
      req.setAttribute("lastname", lastname);
      req.setAttribute("email", email);
      
      Configuration cfg=new Configuration();
      cfg.configure("hibernate-cfg.xml");
      
      SessionFactory sf=cfg.buildSessionFactory();
      Session session=sf.openSession();
      
      Transaction txn=session.beginTransaction();
      
      create_student cs=new create_student();
      cs.setFirstname(firstname);
      cs.setLastname(lastname);
      cs.setEmail(email);
      session.save(cs);
      txn.commit();
      RequestDispatcher rd=req.getRequestDispatcher("create_success.jsp");
      rd.forward(req, resp);
     	}
}
