package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletRequest;

public class JDBC {
	
	public void register(ServletRequest request) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/standard_database","root","root");
			
			PreparedStatement pst = con.prepareStatement("insert into emp(name,email,password,age) values(?,?,?,?)");
			pst.setString(1, request.getParameter("username"));
			pst.setString(2, request.getParameter("email"));
			pst.setString(3, request.getParameter("password"));
			pst.setString(4, request.getParameter("age"));
			
			pst.executeUpdate();
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean check(ServletRequest request) {
		boolean bool = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/standard_database","root","root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp where email=?");
			pst.setString(1, request.getParameter("email"));
			ResultSet rst = pst.executeQuery();
			rst.next();
			if(request.getParameter("password").equals(rst.getString("password"))) {
				
				bool = true;
			}else {
				
				bool = false;
			}	
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return bool;
	}
	
	
	public ResultSet getData(ServletRequest request) {
		Connection con = null;
		ResultSet rst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/standard_database","root","root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp where email=?");
			pst.setString(1, request.getParameter("email"));
			rst = pst.executeQuery();
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return rst;
	}
}
