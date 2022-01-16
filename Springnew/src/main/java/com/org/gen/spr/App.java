package com.org.gen.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorldService service = (HelloWorldService) con.getBean("hello");
        
        String n1 = service.InfoData();
        
        System.out.println(n1);
        
        service.setName("spring");
        
        service.setAddress("Java");
        
        n1 = service.InfoData();
       
        System.out.println(n1);
        
     
        		
    }
}
