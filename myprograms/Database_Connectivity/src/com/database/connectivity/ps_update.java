package com.database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ps_update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
			PreparedStatement ps=con.prepareStatement("update student set id=?,name=? where id=?");
			ps.setInt(1,1);
			ps.setString(2,"neha");
			ps.setInt(3,1);
			int recordUpdated=ps.executeUpdate();
			System.out.println(recordUpdated);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
