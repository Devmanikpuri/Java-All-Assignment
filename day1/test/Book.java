package com.org.day1.test;

public class Book {

	public Book(String title,String author,double price) {
		// TODO Auto-generated constructor stub
		System.out.println("Title : " + title);
		System.out.println("Author : "+ author);
		System.out.println("Price : "+ price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Shreaks","Willaim Shakespeare",1000f);

	}

}
