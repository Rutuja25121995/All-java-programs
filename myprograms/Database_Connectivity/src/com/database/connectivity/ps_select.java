package com.database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ps_select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.print("id--" + rs.getInt(1));
            	System.out.print("  name--"+ rs.getString(2));
            	System.out.println("  email--"+ rs.getString(3));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
