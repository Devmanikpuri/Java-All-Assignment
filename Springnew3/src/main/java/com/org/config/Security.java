package com.org.config;

import org.springframework.stereotype.Component;

@Component
public class Security implements Employee {
	
	
	public Security() {
		super();
		System.out.println("Inside Security constructor");
	}
	
	public void doWork() {
		System.out.println("Security  - Secure the bank......");
	}

}
