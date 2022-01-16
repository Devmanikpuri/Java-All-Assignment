package com.org.config;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{


	public Accountant() {
		super();
		System.out.println("Inside Accountant constructor");
	}
	
	public void doWork() {
		System.out.println("Accountant  - Audit the accounts......");
	}
}
