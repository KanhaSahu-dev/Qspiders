package class24;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class preparedstatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_first_jdbc","root","root");
			
			System.out.println("Enter data in this format (id,name,email,age,pasword,salary)");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			String email = sc.next();
			String pass = sc.next();
			long salary = sc.nextLong();
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, age);
			pst.setString(4, email);
			pst.setString(5, pass);
			pst.setLong(6, salary);
			pst.execute();
			con.close();
			System.out.println("Inserted into the database");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
}
}
