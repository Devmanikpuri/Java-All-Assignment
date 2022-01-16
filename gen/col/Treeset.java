package com.org.gen.col;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> eve  = new TreeSet<Integer>();
		eve.add(2);eve.add(4);eve.add(6);
		System.out.println("TreeSet" + eve);
		TreeSet<Integer> odd  = new TreeSet<Integer>();
		odd.add(1);odd.add(3);odd.add(11);
		
		eve.addAll(odd);
		System.out.println("New Treeset");
		
	}

}
