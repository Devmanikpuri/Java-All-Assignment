package com.org.gen.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JBDCdemo {



public static void main(String[] args) {
try
{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("connection ready");
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/classicmodels","root","D12051999@gmail");
System.out.println("again ready");
Statement stmt=con.createStatement();

//ResultSet rs=stmt.executeQuery("select * from abc");
int result = stmt.executeUpdate("Update abc set name = 'JDBC' where id = 4");
//while(rs.next())
//System.out.println(rs.getInt(1)+" "+ rs.getString(2) );
System.out.println(result + "Row updated");



}
catch(Exception e)
{
System.out.println("err" + e);
}



}



}
