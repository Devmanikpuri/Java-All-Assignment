package com.org.gen.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {
	
	@Autowired
	private Award award;
	
	public void write() {
		System.out.println("Write Technical stuff...");
	}
	
	public void getAward() {
		
	}

}
