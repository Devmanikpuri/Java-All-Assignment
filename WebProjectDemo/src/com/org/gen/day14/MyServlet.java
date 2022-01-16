package com.org.gen.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is servlet using Generic servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
				out.println("<h1>This is my servlet using Generic servlet</h1>");

		
		
	}

}
