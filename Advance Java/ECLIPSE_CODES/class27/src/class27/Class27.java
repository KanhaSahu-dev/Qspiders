package class27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Class27 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
			PreparedStatement pst = con.prepareStatement("select * from emp");
			boolean  b = pst.execute();
			if(b) {
				ResultSet rst = pst.getResultSet();
				while(rst.next()) {
					System.out.println(rst.getString("name"));
				}
			}
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
