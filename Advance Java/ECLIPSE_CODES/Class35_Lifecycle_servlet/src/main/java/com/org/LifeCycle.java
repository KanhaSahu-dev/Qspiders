package com.org;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle implements Servlet{
	
	public LifeCycle() {
		System.out.println("Object Created");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("Destruction of Object");
		
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
		System.out.println("Object initialised");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service method started");
		
	}
	
	
	{
		System.out.println("Non static block created at the object loading time");
	}
	
}
