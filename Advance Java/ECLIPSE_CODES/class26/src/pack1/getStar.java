package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getStar {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class24","root","root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp where age>=20");
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				System.out.println("Id:- "+rst.getInt(1));
				System.out.println("Name:- "+rst.getString(2));
				System.out.println("Age:- "+rst.getInt(3));
			}
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
