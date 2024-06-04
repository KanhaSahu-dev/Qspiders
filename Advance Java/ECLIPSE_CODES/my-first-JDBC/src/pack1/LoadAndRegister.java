package pack1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndRegister {
	//Load and Register Driver
	
	public static void main(String[] args) {
		try {
			java.sql.Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.print("Load and register");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
