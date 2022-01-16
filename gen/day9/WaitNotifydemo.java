package com.org.gen.day9;

//synchronized block
class Threadq extends Thread {
  int total ;
  public void run() {
      synchronized(this) {

      for(int i = 0 ; i<100;i++) {
          total +=i;

      }
      notify();
  }
}

}
public class WaitNotifydemo {

  public static void main(String[] args) {
      // TODO Auto-generated method stub
Threadq q = new Threadq();

q.start();
synchronized(q) {
  try {
      System.out.println("Waiting for q to complete...");
      q.wait();
  }catch (Exception e) {
      // TODO: handle exception
  }
  System.out.println("Total is "+ q.total);
}

  }
}

