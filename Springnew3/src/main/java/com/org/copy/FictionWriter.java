package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {
	
	@Autowired
	@Qualifier("bookAward")
    Award award;
	
	public void write() {
		System.out.println("Write Fiction Novel...");
	}
	
	public void getAward() {
		award.award();
		
	}

}
