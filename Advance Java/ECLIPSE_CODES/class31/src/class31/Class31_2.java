package class31;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Class31_2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_sp","root","root");
			CallableStatement callStmt = con.prepareCall("call fetch_query()");
			ResultSet rst = callStmt.executeQuery();
			while(rst.next()) {
				System.out.println("id "+rst.getInt("id"));
				System.out.println("name "+rst.getString("name"));
				System.out.println("age "+rst.getLong("age"));
			}
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
