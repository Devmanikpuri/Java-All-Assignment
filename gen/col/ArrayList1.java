package com.org.gen.col;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<>();
		color.add("Black");
		color.add("Blue");
		color.add("Red");
		color.add("Yellow");
		
		ListIterator<String> list1 = color.listIterator(color.size());
		while(list1.hasPrevious())
		{
		String str=list1.previous();
		System.out.println(str);
		}
	}

	}


