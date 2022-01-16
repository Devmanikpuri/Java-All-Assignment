package com.org.day1.test;

public class Student {
	
	void display(int r,int p,String a,String name) {
		System.out.println("Name :" + name);
		System.out.println("Roll No:" + r);
		System.out.println("Phone No :" + p);
		System.out.println("Address :" + a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
     	s1.display(111,37653,"Texas","John");
     	s1.display(112,92487,"California","Sam");
		

	}

}
