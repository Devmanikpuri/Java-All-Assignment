package com.org.autotype;

public class AoneClass {

	BoneClass b;

	public AoneClass() {
		super();
		// TODO Auto-generated constructor stub
	
		System.out.println("Class A");
	}
	
	public void setB() {
		this.b = b;
	}

	public BoneClass getB() {
		return b;
	}
	
	public void printName() {
		System.out.println("Hello AoneClass");
	}
	public void display() {
		printName();
		b.printName();
	}
	
	
	
}
