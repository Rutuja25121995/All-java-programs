package com.database.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ps_delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practise_database","root","root");
			PreparedStatement ps=con.prepareStatement("delete from student where id=?");
			ps.setInt(1,3);
			int recorddeleted=ps.executeUpdate();
			System.out.println(recorddeleted);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
