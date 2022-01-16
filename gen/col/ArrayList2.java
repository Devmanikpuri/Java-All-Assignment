package com.org.gen.col;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> city=new ArrayList<>();
		city.add("Bangalore");
		city.add("Pune");
		city.add("Mumbai");
		city.add("Delhi");
		
		city.set(3, "Bhilai");
		
		ListIterator<String> list = city.listIterator(city.size());
		while(list.hasPrevious())
		{
		String str=list.previous();
		System.out.println(str);
		}
		
	
	}

}
