package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndRegister1 {
public static void main(String[] args) {
	try {
//		Load and Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establishing Connection
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		System.out.println("Loaded and Registered");
		System.out.println("Connection established");
	}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
