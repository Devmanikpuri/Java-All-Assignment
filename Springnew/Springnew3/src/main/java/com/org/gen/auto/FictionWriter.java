package com.org.gen.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {
	
	@Autowired
	private Award award;
	
	public void write() {
		System.out.println("Write Fiction Novel...");
	}
	
	public void getAward() {
		award.award();
		
	}

}
