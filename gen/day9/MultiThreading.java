package com.org.gen.day9;



class T1 extends Thread{
	public void start() {
		System.out.println("Task One");
		
	}
}

class T2 extends Thread{
	public void start() {
		System.out.println("Task Two");
		
	}
}

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();

	}

}
