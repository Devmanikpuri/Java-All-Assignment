package com.org.gen.day8;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private String date;
	private int age;
	private int salary;
	public Employee(int id, String name, String department, int age, int salary,String date) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
		this.date = date;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDate() {
		return name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str =  String.format("%-15s %-15s %-15s",name,department,date);
		return str;
	}
}
	
	


