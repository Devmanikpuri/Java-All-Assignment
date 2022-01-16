package com.org.gen.day1;

class HelloWorld {
	int rollno;//instance variable
	   String name;
	  static String college ="ITS";//static variable
	   //constructor
	   HelloWorld(int r, String n){
	   rollno = r;
	   name = n;
	   }
	   //method to display the values
	   void display (){System.out.println(rollno+" "+name+" "+college);}
	
 
    	
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        HelloWorld h = new HelloWorld(123,"abc");
  
       
        h.display();
    }

}
