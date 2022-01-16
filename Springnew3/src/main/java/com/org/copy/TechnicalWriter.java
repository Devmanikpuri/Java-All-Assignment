package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {
	
	@Autowired
	@Qualifier("PultizerAward")
    Award award;
	
	public void write() {
		System.out.println("Write Technical stuff...");
	}
	
	public void getAward() {
		
	}

}
