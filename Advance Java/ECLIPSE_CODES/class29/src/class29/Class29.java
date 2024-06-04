package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
public class Class29 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\QSPIDERS\\Advance Java\\ECLIPSE_CODES\\class29\\lib\\config.properties");
			Properties properties = new Properties();
			properties.load(fis);
			String fqnDriver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String pwd = properties.getProperty("password");
			
			Class.forName(fqnDriver);
			Connection con  = DriverManager.getConnection(url,user,pwd);
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
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
