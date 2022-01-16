package com.org.gen.SpringJDBCTran;

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
  
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        
        CustomerDAO customerDao = (CustomerDAO) context.getBean("customerDao");
        
        Customer customer = new Customer(1,"ABC",20);
        
        customerDao.insert(customer);
        
        Customer customer1 = customerDao.findByCustomerId(1);
        
        System.out.println(customer1);
        
        ((AbstractApplicationContext)context).close();
    
    }
}
