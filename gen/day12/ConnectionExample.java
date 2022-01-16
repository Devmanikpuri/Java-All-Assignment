package com.org.gen.day12;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConnectionExample {

	public static void main(String[] args) throws Exception {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassNAme("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
		dataSource.SetUsername("root");
		dataSource.SetPassword("root");
		dataSource.SetInitialSize(1);
		Connection con = dataSource.getConnection();
		System.out.println("Connection Object information :"+ con);
		

	}

}
