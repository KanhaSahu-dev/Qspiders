package com.org.dao;
import com.org.dto.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDao {
	
	public String save(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			PreparedStatement pst = con.prepareStatement("insert into emp(id,name,age,email,password,salary) values(?,?,?,?,?,?)");
			pst.setInt(1, emp.getId());
			pst.setString(2, emp.getName());
			pst.setInt(3, emp.getAge());
			pst.setString(4, emp.getEmail());
			pst.setString(5, emp.getPassword());
			pst.setLong(6, emp.getSalary());
			
			pst.executeUpdate();
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return "Data saved  to the database successfully";
	}
	
	public boolean fetchByEmailAndPassword(String email,String password) {
		boolean res=false;
		String pwd = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			PreparedStatement pst = con.prepareStatement("select * from emp where email = ?");
			pst.setString(1, email);
			ResultSet rst = pst.executeQuery();
			if(rst.next()) {
				pwd =  rst.getString("password");
				res = pwd.equals(password);
			}
			else
				System.out.println("Your email is wrong");
				
			con.close();
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	
	public List<Employee> fetchAll(){
		List<Employee> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			PreparedStatement pst = con.prepareStatement("select * from emp");
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				Employee emp = new Employee();
				 emp.setId(rst.getInt("id"));
				 emp.setName(rst.getString("name"));
				 emp.setAge(rst.getInt("age"));
				 emp.setEmail(rst.getString("email"));
				 emp.setPassword(rst.getString("password"));
				 emp.setSalary(rst.getLong("salary"));
				 list.add(emp);
				 
			}
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public boolean deleteById(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			PreparedStatement pst = con.prepareStatement("delete from emp where id = ?");
			pst.setInt(1, id);
			pst.executeUpdate();
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public Employee fetchById(int id) {
		Employee emp = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			PreparedStatement pst = con.prepareStatement("select * from emp where id = ?");
			pst.setInt(1, id);
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				emp.setId(rst.getInt("id"));
				emp.setName(rst.getString("name"));
				emp.setAge(rst.getInt("age"));
				emp.setEmail(rst.getString("email"));
				emp.setPassword(rst.getString("password"));
				emp.setSalary(rst.getInt("salary"));
			}
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public int updateById(int id) {
		int rows = 0;
		try
		(Scanner sc = new Scanner(System.in))
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/assignment5_class30","root","root");
			System.out.println("What do you want to update? (name,age,email,password,salary)");
			String data = sc.next();
			System.out.println("Give the value");
			String value = sc.next();
			PreparedStatement pst = con.prepareStatement("update emp set "+data+"=? where id=?");
			pst.setString(1, value);
			pst.setInt(2, id);
			 rows = pst.executeUpdate();
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}
}		
