package com.org.gen.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc_prepared {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/classicmodels","root","D12051999@gmail");
			System.out.println("again ready");
			
			PreparedStatement p1 = con.prepareStatement(" insert into abc values(?,?)");
		
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    
		    do {
		    	System.out.println("enter id");
		    	
		    	int id = Integer.parseInt(br.readLine());
		    	
		    	System.out.println("enter name");
		    	
		    	String name = br.readLine();
		    	
		    	p1.setInt(1,id);
		    	p1.setString(2,name);
		    	
		    	int row = p1.executeUpdate();
		    	System.out.println(row + "rows Inserted");
		    	
		    	System.out.println("Do you want to insert more records : y/n");
		    	String s = br.readLine();
		    	if(s.startsWith("n")) {
		    		break;
		    	}
		    }
		    	while(true);
		    	
		    	
		    	

		}catch(Exception e) {
			System.out.println(e);
			}
		
	}
}

