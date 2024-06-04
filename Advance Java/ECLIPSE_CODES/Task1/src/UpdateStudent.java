
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {
public static void main(String[] args) {
	try {
//		Load and Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		Establishing Connection
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
//		Create A Platform
		
		Statement stmt = con.createStatement();
		System.out.println("Platform created Successfully");
		
//		Execute Query
		stmt.execute("update assignment2.student set name = 'tushar' where id = 3 ");
		
		
//		Close Connection
		con.close();
		
		System.out.println("Data has been inserted");
		
		
		
		
		
		
}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}