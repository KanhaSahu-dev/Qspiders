package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishConnection {
public static void main(String[] args) {
	try {
//		Load and Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establishing Connection
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
//		Create A Platform
		
		Statement stmt = con.createStatement();
		System.out.println("Platform created Successfully");
		
//		Execute Query
		stmt.execute("insert into my_first_jdbc.emp(id,name,age,salary,email,password) "
				+ "values(3,'ding',15,1000,'dingi@gmail.com','dinga')");
		
//		Close Connection
		con.close();
		
		System.out.println("Data has been inserted");
		
		
		
		
		
		
}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}