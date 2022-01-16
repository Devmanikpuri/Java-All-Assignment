package com.org.gen.day3;

	import java.util.Scanner;
	 
	//callback interface in java 
	interface A{
	    double A();//abs method 
	}
	 
	class MyClass1 implements A{
	 
	    @Override
	    public double A() {
	        // TODO Auto-generated method stub
	        return 1500.0;
	    }

	}
	class MyClass2 implements A{
	 
	    @Override
	    public double A() {
	        // TODO Auto-generated method stub
	        return 2500.0;
	    }

	}
	public class UseCallable {
	 
	    
	    static void calculatedata( A a) {
	        double c = 55000.0;
	        double p = a.A();
	        double q = p+c;
	        System.out.println(" total value = "+q);
	    }
	    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	        // TODO Auto-generated method stub


	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the classname ");
	String s = sc.next();
	Class obj = Class.forName(s);
	A a1 = (A) obj.newInstance();
	calculatedata(a1);
	    }
	 
	}


