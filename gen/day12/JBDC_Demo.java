package com.org.gen.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDC_Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/classicmodels","root","D12051999@gmail");
			System.out.println("again ready");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from abc");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+ " "+rs.getString(2));
			con.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
