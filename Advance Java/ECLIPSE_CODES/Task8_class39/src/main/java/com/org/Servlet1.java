package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		JDBC ob = new JDBC();
		boolean bool = ob.check(request);
		if(bool) {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			ResultSet rst = ob.getData(request);
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			try {
				rst.next();
				
				RequestDispatcher rdd = request.getRequestDispatcher("index.html");
				rdd.include(request, response);
				
				out.println("<br><br><br><br>"+rst.getString("name")+"<br>");
				out.println(rst.getString("email")+"<br>");
				out.println(rst.getString("password")+"<br>");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<h1>Invalid User Details</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}
