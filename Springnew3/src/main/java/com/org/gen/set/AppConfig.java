package com.org.gen.set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org,gen.set")
public class AppConfig {
	
	@Bean
	public Department getDepartment() {
		return new DepartmentImpl();
	}

}
