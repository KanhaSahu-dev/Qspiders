package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Class36 implements Servlet{

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
		
		String[] arr = {
				"You'll find yourself immersed in a career that combines your passions and expertise.",
				"In the future, you'll embark on adventures that expand your horizons and enrich your soul.",
				"Your journey ahead will be filled with unexpected opportunities that lead to personal growth.",
				"The future holds moments of profound clarity, guiding you towards your true purpose.",
				"In the future, you'll embrace challenges as stepping stones to success and fulfillment."
		};
		
		Random r = new Random();
		int random = r.nextInt(arr.length-1);
		
		response.setContentType("text/html");
		out.println("<h1>Hello !</h1><br><br>"
				+ "<h1>"+arr[random]+"</h1>");
	}

}
