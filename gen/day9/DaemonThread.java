package com.org.gen.day9;

public class DaemonThread extends Thread{
	
	public void start() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Work");
		}
		else {
			System.out.println("Not working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d1 = new DaemonThread();
		DaemonThread d2 = new DaemonThread();
		
		d1.setDaemon(true);
		d1.start();
		

	}

}
