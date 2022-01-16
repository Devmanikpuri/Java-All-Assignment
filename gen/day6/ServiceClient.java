package com.org.gen.day6;

public class ServiceClient {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RegistrationService service = new RegistrationService();
      service.validateEmail("Abc@gmail.com");
      service.validateEmail("bbb@gmail.com");
    }
 
}
