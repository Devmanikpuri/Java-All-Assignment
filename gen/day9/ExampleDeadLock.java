package com.org.gen.day9;

public class ExampleDeadLock {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
String s1 = " Stripdata" ;
String s2 = " Java FSD" ;
 
Thread t1 = new Thread () {
    public void run() {
        synchronized(s1) {
            System.out.println(" Thread 1 : Locked s1");
            try {
                Thread.sleep(200);
            }catch (Exception e) {
                // TODO: handle exception

            }
            synchronized(s2) {
                System.out.println(" acquired both");
            }
        }
        System.out.println("completed t1");
    }
};
 
Thread t2 = new Thread() {
    public void run() {
        synchronized(s2) {
            System.out.println(" Thread 2 : Locked s2");
            try {
                Thread.sleep(200);
            }catch (Exception e) {
                // TODO: handle exception

            }
            synchronized(s1) {
                System.out.println(" Acquired both ");
            }
        }
        System.out.println("completed t2");
    }
};
 
t1.start();
t2.start();
    }
 
}
