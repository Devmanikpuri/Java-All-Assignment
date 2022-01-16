package com.org.day1.test;

public class Employee {

	public Employee(String name,int y,double salary,String add) {
		// TODO Auto-generated constructor stub
		System.out.println("Name :" + name+"          "+y+"            "+
		salary+"          "+add);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Robert",1994,6.5f,"64C - WallsStreat");
		Employee emp2 = new Employee("Sam",2000,4.5f,"68C - WallsStreat");
		Employee emp3 = new Employee("John",1999,5.5f,"26B - WallsStreat");
	}

}
/*Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/