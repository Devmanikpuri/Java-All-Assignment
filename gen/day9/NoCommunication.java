package com.org.gen.day9;

class A{
    int i ;
    boolean flage = false;
    synchronized void deliver( int i ) {
        if(flage)//when data production is over falge will be true 
            try {
                wait();//wait till notification is received from thread2 
            }catch (Exception e) {
                // TODO: handle exception
            }
        this.i = i ;
        flage= true;//when data prod is over it will store true into flage 
                System.out.println(" data delivered: "+ i );
                notify();//it will notify thread2 to use it 
    }
    synchronized int receive() {
        if(!flage)//wait till notification is recevied from thread 11 
            try {
                wait();
            }catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        System.out.println("data received : "+ i);
        flage = false;// it will store into flag when data is received 
        notify();//when data received s over it will notify thread1 to produce next data 

        return i ;
    }
}
 
class Thread11 extends Thread {
    A obj;
 
    public Thread11(A obj) {
        super();
        this.obj = obj;
    }
    public void run() {
        for(int j = 1 ; j<=5;j++) {
            obj.deliver(j);
        }
    }
 
}
 
class Thread2 extends Thread {
    A obj;
 
    public Thread2(A obj) {
        super();
        this.obj = obj;
    }
    public void run() {
        for(int j = 1 ; j<=5;j++) {
            obj.receive();
        }
    }
}
public class NoCommunication {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        A obj = new A();
Thread11 t1 = new Thread11(obj);
Thread2 t2 = new Thread2(obj);
t1.start();
t2.start();
    }
 
}
