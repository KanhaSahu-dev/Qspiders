package task4_class26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task_Done {

	//TASK
	//-----
	//user going to give email and password
	//Whether it is present or not check  
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment4_class26","root","root");
			
			PreparedStatement pst;
			
			boolean quit = false;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome user, To check whether u have registered");
			
			while(true) {
				System.out.println("Enter the username:");
				String username = sc.nextLine();
				System.out.println("Enter the password:");
				String password = sc.nextLine();
				
				pst=con.prepareStatement("select * from emp where username = ?");
				pst.setString(1, username);
				ResultSet rst = pst.executeQuery();
				
				if(!rst.next()) {
					System.out.println("Entered UserName is Wrong");
					continue;
				}
				
				pst=con.prepareStatement("select * from emp where password = ?");
				pst.setString(1, password);
				rst = pst.executeQuery();
				
				if(!rst.next()) {
					System.out.println("Entered Password is Wrong");
					System.out.println("Want to change Password Yes/No");
					String choice = sc.nextLine();
					if(choice.toLowerCase().equals("yes")) {
						System.out.println("Enter new Password");
						String pass = sc.nextLine();
						//fetching the password based on the username
						
						pst = con.prepareStatement("select password from emp where username =?");
						pst.setString(1, username);
						ResultSet rst1 = pst.executeQuery();
						rst1.next();
						password = rst1.getString("password");
				//  Major Mistake of mine was that we have to move the cursor to the first row as it is in void or pointing to null.
						pst = con.prepareStatement("update emp set password=replace(?,?,?) where username=?");
						pst.setString(1,password);
						pst.setString(2,password);
						pst.setString(3,pass);
						pst.setString(4,username);
						pst.executeUpdate();
						System.out.println("Password Successfully Changed");
					}
					
				}else {
					System.out.println("Congratulations the  username and password are all correct.");
				}
				
				System.out.println("Do you want to quit Press 'quit' or type anything except 'quit'");
				String res = sc.nextLine();
				if(res.equals("quit"))
					break;
			}
			System.out.println("You have quitted successfully.");
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
