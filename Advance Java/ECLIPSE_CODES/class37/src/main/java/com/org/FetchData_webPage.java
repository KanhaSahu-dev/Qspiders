package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FetchData_webPage implements Servlet{

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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String age_string = request.getParameter("age");
		String id_string = request.getParameter("Id");
		int age = Integer.parseInt(age_string);
		int id = Integer.parseInt(id_string);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class37","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?,?,?,?)");
			stmt.setInt(1,id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setString(4, email);
			stmt.setString(5, pass);
			stmt.executeUpdate();
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		System.out.println("Hello");
		out.println("<h1>Registration Successfull</h1>");
	}

}
