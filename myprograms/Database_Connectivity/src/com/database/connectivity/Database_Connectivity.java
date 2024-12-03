package com.database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database_Connectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
		  Statement  statement=con.createStatement();
		  int recordnumber=statement.executeUpdate("insert into student(id,name,email)values(1,'rutuja','r@gmail.com')");
		  System.out.println(recordnumber);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
