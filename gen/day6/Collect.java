package com.org.gen.day6;

import java.util.*;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<>();
		li.add("Ejaz");
		li.add("Dev");
		li.add("Aditya");
		li.add("Fardeen");
		li.add("Abhishek");
		li.add("Nikhil");
		li.add("Harsh");
		li.add("Shivam");
	
		ArrayList<String> li1=new ArrayList<>();
		li1.add("Amit");
		li1.add("Guru");
		li1.add("Gaurav");
		li1.add("Rajiv");
		
		ArrayList<String> li2=new ArrayList<>();
		List<String> li4=li.subList(2,4);
		ListIterator<String> list1=li4.listIterator(li4.size());
		while(list1.hasPrevious())
		{
		String str=list1.previous();
		System.out.println(str);
		}

}
}	
