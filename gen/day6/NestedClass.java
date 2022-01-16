package com.org.gen.day6;

public class NestedClass {

	try {
		try {
			System.out.println("Inside Block 1");
			int p = 100/0;
			System.out.println(p);
		
		}catch(ArithmeticException e) {
			System.out.println("Exception");
		}
		try {
			System.out.println("Inside block 2");
		}
		
	}catch() {
		
	}
}
