package com.org.gen.day4;

@FunctionalInterface
interface MyInterface{
    //public String sayHello();
    public int addNumber(int a , int b , int c );
}
 

public class LamdaDemo {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     //lambda expression
    /*    MyInterface m = ()->{return "hello lambda expression "; 
    };
 System.out.println(m.sayHello());*/

        //for parameters 
        MyInterface m1 = (n1,n2,n3)->{if(n1>n2) {
            System.out.println(n1);}
        else {
            System.out.println(" not working");
        }
        return n1;
        };

        System.out.println(m1.addNumber(2,2,5));
}
}


