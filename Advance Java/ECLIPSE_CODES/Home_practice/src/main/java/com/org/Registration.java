package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Registration implements Servlet{
	
	int id=1;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void  service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		Jdbc o = new Jdbc();
		o.accept_para(id, name, email, pass, o);
		id++;
		o.store_db();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Registration Succesfull</h1>");
	}

}
