package com.org.config;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {
	
	Accountant acc;
	
	public Manager(Accountant acc) {
		System.out.println("Manager Constructor");
		this.acc = acc;
	}

	public void doWork() {
		
	}

	
	public void callMeeting() {
		acc.doWork();
		
	}
}
