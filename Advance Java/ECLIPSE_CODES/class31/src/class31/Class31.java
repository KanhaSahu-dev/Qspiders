package class31;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class31 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_sp","root","root");
			CallableStatement callStmt = con.prepareCall("call insert_procedure()");
			int i = callStmt.executeUpdate();
			System.out.println(i+" rows affected");
			con.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
