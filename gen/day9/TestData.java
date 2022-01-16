package com.org.gen.day9;

class Number1{
synchronized    static void printData(int n ) {
        for(int i = 0 ; i<=10;i++) {
            System.out.println(n*i);
        }
        try {
            Thread.sleep(500);
        }catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class Room1 extends Thread {
    public void run() {
        Number1.printData(10);
    }
}
class Room2 extends Thread{
    public void run() {
        Number1.printData(20);
    }
}
class Room3 extends Thread{
    public void run() {
        Number1.printData(30);
    }
}
class Room4 extends Thread{
    public void run() {
        Number1.printData(40);
    }
}
public class TestData {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
Room1 t1 = new Room1();Room2 t2 = new Room2();Room3 t3 = new Room3();Room4 t4 = new Room4();
t1.start();t2.start();t3.start();t4.start();
 
    }
 
}
