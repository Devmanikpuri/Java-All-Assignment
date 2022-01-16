package com.org.gen.day9;

class MyRunnable  implements Runnable{
	 
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            System.out.println(Thread.currentThread().getName()+"  start");

            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+"  end");
        }catch (Exception e) {
            // TODO: handle exception
        }
    }

}
 
public class ThreadExam {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
System.out.println(" Main thread execution start ");
MyRunnable mr = new MyRunnable();
Thread t1 = new Thread(mr,"Thread1");
Thread t2 = new Thread(mr,"Thread2");
Thread t3 = new Thread(mr,"Thread3");
 
t1.start();//lets waits for t1 to die
try {
    t1.join(4000);
}catch (Exception e) {
    // TODO: handle exception
}
t2.start();//lets wait for 1 sec to t2 die which ever occurs first
try {
    t2.join(1000);
}catch (Exception e) {
    // TODO: handle exception
}
t3.start();
try {
    t2.join();t3.join();
}catch (Exception e) {
    // TODO: handle exception
}
System.out.println("Main Thread execution ends ");
    }
 
}