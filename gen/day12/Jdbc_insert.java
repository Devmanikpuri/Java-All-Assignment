package com.org.gen.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/classicmodels","root","D12051999@gmail");
			System.out.println("again ready");
			
			Statement stmt = con.createStatement();
			int insert = stmt.executeUpdate("insert into abc(id,name) values(4,'abb'),(5,'kxs')");
			System.out.println(insert + " Value inerted");

	}catch(Exception e) {
		System.out.println(e);
	}

}
}
