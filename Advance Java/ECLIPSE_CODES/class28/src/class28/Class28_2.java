package class28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Class28_2 {
	public static void main(String[] args) {
		
		
		//Try with resources.
		
		//Adding the costly resources inside the paranthesis of the try block.
		try 
		(
			Connection	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
				
			PreparedStatement	 pst = con.prepareStatement("select * from emp");
				
			ResultSet	 rst = pst.executeQuery();	
		)
		
		{
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 while(rst.next()) {
					System.out.print(rst.getInt("id"));
					System.out.print("  ");
					System.out.print(rst.getString("name"));
					System.out.print("  ");
					System.out.print(rst.getInt("age"));
					System.out.print("   ");
					System.out.print(rst.getLong("salary"));
					System.out.println();
				}
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
