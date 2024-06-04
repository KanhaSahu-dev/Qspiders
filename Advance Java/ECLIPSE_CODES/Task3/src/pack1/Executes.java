package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Executes {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_second_jdbc","root","root");
			PreparedStatement p = con.prepareStatement("update emp set age = age+1 where name like name.length>=4");
			p.executeUpdate();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();	
		}
	}

}
