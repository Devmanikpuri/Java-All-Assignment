package com.org.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Manager n = con.getBean(Manager.class);
		
		n.callMeeting();
		con.close();
	}

}
