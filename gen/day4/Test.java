package com.org.gen.day4;

class Clonetest implements Cloneable{
	int i;
	String s;
	public Clonetest(int i,String s) {
		super();
		this.i = i;
		this.s =s;
		}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
