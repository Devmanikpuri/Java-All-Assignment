package com.org.day1.test;

public class NumberHolder {
	
	public int anInt;
    public float aFloat;
    
    public void display(int i,float f) {
    	anInt = i;
    	aFloat = f;
    	System.out.println("anInt = " + anInt );
    	System.out.println("aFloat = "+ aFloat);
    }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberHolder num = new NumberHolder();
		num.display(12,50f);
		

	}

}
