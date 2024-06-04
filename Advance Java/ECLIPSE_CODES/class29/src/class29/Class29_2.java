package class29;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Class29_2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\QSPIDERS\\Advance Java\\ECLIPSE_CODES\\class29\\lib\\config.properties");
			Properties properties = new Properties();
			properties.load(fis);
			
			Class.forName(properties.getProperty("driver"));
			Connection con = DriverManager.getConnection(properties.getProperty("url"),properties);
			
			PreparedStatement pst = con.prepareStatement("select * from emp");
			ResultSet rst = pst.executeQuery();
			while(rst.next()) {
				System.out.println("Id:- "+rst.getInt(1));
				System.out.println("Name:- "+rst.getString(2));
				System.out.println("Age:- "+rst.getInt(3));
				System.out.println("Email:- "+rst.getString(4));
				System.out.println("Password:- "+rst.getString(5));
				System.out.println("Salary:- "+rst.getLong(6));
				System.out.println("-------------------------");
			}
			con.close();
			
			
		} catch (ClassNotFoundException |SQLException |IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
