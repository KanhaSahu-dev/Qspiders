package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Class30 {

	public static void main(String[] args) {
		try 
		(
				Scanner sc = new Scanner(System.in);
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
		)
		
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Enter the rows");
			int rows = sc.nextInt();
			PreparedStatement pst = con.prepareStatement("insert into emp(id,name,age,email,password,salary) values(?,?,?,?,?,?)");
			for(int i = 0;i<rows;i++) {
				
				System.out.println("Enter your id");
				int id = sc.nextInt();
				pst.setInt(1,id);
				System.out.println("Enter your name");
				String name = sc.next();
				pst.setString(2,name);
				System.out.println("Enter your age");
				int age = sc.nextInt();
				pst.setInt(3,age);
				System.out.println("Enter your email");
				String email = sc.next();
				pst.setString(4,email);
				System.out.println("Enter your pass");
				String pass = sc.next();
				pst.setString(5,pass);
				System.out.println("Enter your salary");
				long salary = sc.nextLong();
				pst.setLong(6,salary);
				pst.addBatch();
			}
			pst.executeBatch();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
