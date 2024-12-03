package com.tech;

import java.io.IOException;

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

public class Login_Servlet extends HttpServlet{

	public Login_Servlet() {
		super();
		System.out.println("inside constructor");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		req.setAttribute("UNAME", username);
		req.setAttribute("PASS", password);
		Configuration cfg=new Configuration();
		cfg.configure("hibernate-cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Criteria cr=session.createCriteria(Student.class);
		Criterion cr1=Restrictions.eq("username",username);
		Criterion cr2=Restrictions.eq("password",password);
		cr.add(cr1);
		cr.add(cr2);
		System.out.println(cr);
		System.out.println("--------------------");
		Student student= (Student) cr.uniqueResult();
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
