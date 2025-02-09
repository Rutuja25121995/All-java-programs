package com.tech;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class jdbc_insert_servlet extends HttpServlet{
	public jdbc_insert_servlet() {
		System.out.println("inside jdbc_join_servlet constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("inside init() method");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		System.out.println(fname+" "+lname);
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
		PreparedStatement ps=con.prepareStatement("insert into employee(fname,lname)values(?,?)");
		ps.setString(1, fname);
		ps.setString(2, lname);
		int resultinsert=ps.executeUpdate();
		System.out.println(resultinsert);
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}

}
