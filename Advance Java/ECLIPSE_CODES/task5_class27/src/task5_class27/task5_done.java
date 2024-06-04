package task5_class27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//Print the employee details those having age greater than 20 less than 30.
//Print the employees details those having the salary is less than 1000.
//Print the employees details based on the id.
public class task5_done {

	public static void main(String[] args) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment5_class27","root","root");
			 Scanner sc = new Scanner(System.in);
			 PreparedStatement pst = null;
			 System.out.println("Press 1. Print the employee details those having age greater than 20 less than 30.\n"
			 		+ "Press 2. Print the employees details those having the salary is less than 1000.\n"
			 		+ "Press 3. Print the employees details based on the id.");
			 
			 int choice = sc.nextInt();
			 switch(choice) {
			 case 1:{
				 System.out.println("Employees having their age greater than 20 less than 30");
				 pst = con.prepareStatement("select * from emp where age>20 and age<30");
				break; 
			 }
			 case 2:{
				 System.out.println("Employees whose salary greater than 1000.");
				 pst = con.prepareStatement("select * from emp where salary>1000");
				break;  
			 }
			 case 3:{
				 System.out.println("Employees details based on the id.");
				 System.out.println("Enter the id");
				 int id = sc.nextInt();
				 pst = con.prepareStatement("select * from emp where id="+id);
				break;  
			 }
			 }
			 
			 
			 //Using only execute method and using getResultSet() to get the ResultSetObject
			 
			 boolean isResultSet = pst.execute();
			 
			 if(isResultSet) {
				ResultSet rst = pst.getResultSet(); 
				System.err.println("Id Name Age Salary");
				System.err.println("-- ---- --- ------");
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
			 }
			 
			 con.close();
			 sc.close();
		 }catch(ClassNotFoundException | SQLException e) {
			 e.printStackTrace();
		 }

	}

}
