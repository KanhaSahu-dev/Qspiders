package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		JDBC ob = new JDBC();
		
		ob.register(request);
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Successfully Registered</h1>");
	}

}
