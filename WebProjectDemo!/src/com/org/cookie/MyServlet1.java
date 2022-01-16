package com.org.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name = "Servlet1", urlPatterns = { "/Servlet1" })
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String n = request.getParameter("user");
		String p = request.getParameter("password");
		if(p.equals("1234"))
		{
		Cookie ck = new Cookie("username",n);
		response.addCookie(ck);
		response.sendRedirect("FirstServlet");
		}
		else {
		pw.println("Incorect userid or password");
		RequestDispatcher rd =request.getRequestDispatcher("/Cookie.html");
		rd.include(request,response);
		}
		
	}

}
