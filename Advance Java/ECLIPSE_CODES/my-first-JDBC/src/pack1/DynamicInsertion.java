package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsertion {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
		
//		statement
		
		Statement stmt = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
//		id, name, age,email,password,salary
		System.out.println("Enter your new id");
		int id = sc.nextInt();
		System.out.println("Enter your new name");
		String name = sc.next();
		System.out.println("Enter your new age");
		int age = sc.nextInt();
		System.out.println("Enter your new email");
		String email = sc.next();
		System.out.println("Enter your new password");
		String password = sc.next();
		System.out.println("Enter your new salary");
		int salary = sc.nextInt();
		
		stmt.execute("insert into emp values("+id+",'"+name+"',"+age+",'"+email+"',"+"'"+password+"',"+salary+")");
		
		System.out.println("Connection Closed");
		sc.close();
		con.close();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
