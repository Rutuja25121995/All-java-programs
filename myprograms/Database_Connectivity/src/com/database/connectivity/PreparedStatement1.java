package com.database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
			PreparedStatement ps=con.prepareStatement("insert into student(id,name,email) values (?,?,?)");	
		    ps.setInt(1,4);
		    ps.setString(2,"namrata");
		    ps.setString(3,"namrata@gmail.com");
		    int record=ps.executeUpdate();
		    System.out.println(record);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
