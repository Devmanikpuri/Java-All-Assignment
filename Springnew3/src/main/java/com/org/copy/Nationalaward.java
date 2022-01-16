package com.org.copy;

import org.springframework.stereotype.Component;

@Component
public class Nationalaward implements Award {
	
	public void award() {
		System.out.println("Writting got National Award");
	}
	
	
}
