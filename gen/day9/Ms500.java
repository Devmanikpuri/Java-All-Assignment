package com.org.gen.day9;

class Test1 extends Thread{
	public void start() {
		System.out.println("Task One");
		System.out.println("Current Thread Name:"+Thread.currentThread().getName());
		
	}
}

class Test2 extends Thread{
	public void start() {
		try {
			Thread.sleep(500);
			System.out.println("Task Two");
			System.out.println("Current Thread Name:"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}

public class Ms500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.start();
		t2.start();

	}

}
