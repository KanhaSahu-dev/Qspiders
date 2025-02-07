package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc {
	
	int id;
	String name;
	String email;
	String password;
	static Jdbc obj;
	
	public void accept_para(int id,String name,String email,String pass,Jdbc o) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=pass;
		obj=o;
	}
	
	
	
public  void store_db() {
	Connection con = null;
	PreparedStatement pst = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_practice","root","root");
		pst = con.prepareStatement("insert into emp values(?,?,?,?)");
		
		pst.setInt(1, obj.id);
		pst.setString(2, obj.name);
		pst.setString(3, obj.email);
		pst.setString(4, obj.password);
		
		pst.executeUpdate();
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if(pst!=null)
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}



}
