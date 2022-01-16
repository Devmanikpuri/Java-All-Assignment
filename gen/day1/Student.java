package com.org.gen.day1;

public class Student {
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	/*The this keyword can be used to refer current class instance variable.
	 *  If there is ambiguity between the instance variables and parameters, 
	 *  this keyword resolves the problem of ambiguity*/
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(111,"dev",5000f);
		Student s2 = new Student(112,"dev",6000f);
		s1.display();
		s2.display();
	}

}
