package com.org.gen.col;

import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> city=new ArrayList<>();
		city.add("Bangalore");
		city.add("Pune");
		city.add("Mumbai");
		city.add("Delhi");
		
		city.remove(3);
		
		Collections.sort(city);
		
		ListIterator<String> list = city.listIterator(city.size());
		while(list.hasPrevious())
		{
		String str=list.previous();
		System.out.println(str);
		}

	}

}
