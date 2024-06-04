package com.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Practice1 implements Servlet{

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
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	System.out.println("This is not printing too?");
	
	try
	{
		FileReader file = new FileReader("D:\\QSPIDERS\\WEB_TECH_PRACITCE\\practice1.html");
				
		System.out.println("outside");
		BufferedReader read  = new BufferedReader(file);
		String line;
		
		while((line=read.readLine())!=null) {
			System.out.println("Is this printing");
			out.println(line);
		}
		
	}catch(IOException e) {
		e.printStackTrace();
	}

	}

}
