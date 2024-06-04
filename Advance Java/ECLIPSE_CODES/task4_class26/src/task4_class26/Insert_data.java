package task4_class26;

//TASK
//-----
//user going to give email and password
//Whether it is present or not check  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_data {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment4_class26","root","root");
			//Insert
			PreparedStatement pst = con.prepareStatement("insert into emp values(7,'D@gmail.com','D@123')");
//			pst.execute();
//			 pst = con.prepareStatement("insert into emp values(5,'B@gmail.com','B@123')");
//			pst.execute();
//			 pst = con.prepareStatement("insert into emp values(6,'C@gmail.com','C@123')");
			int b = pst.executeUpdate(); 
			
			con.close();
			System.out.println(b);
			System.out.println("Data inserted Successfully");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
