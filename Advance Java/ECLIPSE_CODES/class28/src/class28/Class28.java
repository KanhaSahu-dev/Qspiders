package class28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Class28 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
			
			 pst = con.prepareStatement("select * from emp");
			
			 rst = pst.executeQuery();
			 while(rst.next()) {
					System.out.print(rst.getInt("id"));
					System.out.print("  ");
					System.out.print(rst.getString("name"));
					System.out.print("  ");
					System.out.print(rst.getInt("age"));
					System.out.print("   ");
					System.out.print(rst.getLong("salary"));
					System.out.println();		}
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			//Check whether ResultSet Object has been created or not.
			try {
				
				if(rst!=null) 
					rst.close();
				if(pst!=null)
					pst.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
