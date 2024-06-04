package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Next_fetch {
	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class24","root","root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp");
			
			ResultSet rst = pst.executeQuery();
			while(rst.next()) 
				System.out.println(rst);
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


