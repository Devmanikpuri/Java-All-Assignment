package com.org.autotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");

	
		AoneClass a1 = con.getBean(AoneClass.class);
		a1.display();
	}
	

}
