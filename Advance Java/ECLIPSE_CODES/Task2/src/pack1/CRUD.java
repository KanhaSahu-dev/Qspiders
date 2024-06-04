package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		try {
//			load & register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment3","root","root");
			
//			platform setting
			Statement stmt = con.createStatement();
			
			
//			Performing CRUD Operations
			Scanner sc = new Scanner(System.in);
			System.out.println("			   --Welcome to CRUD App--");
			while(true) {
				boolean contd = false;
				System.out.println("1.Register a new User");
				System.out.println("2.Delete existing one");
				System.out.println("3.Update existing one");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:{
					System.out.println("Enter your Id");
					int id = sc.nextInt();
					System.out.println("Enter your Name");
					String name = sc.next();
					System.out.println("Enter your Age");
					int age = sc.nextInt();
					System.out.println("Enter your Gender");
					String gen = sc.next();
					System.out.println("Enter your Email");
					String email = sc.next();
					
					stmt.execute("insert into emp values("+id+",'"+name+"',"+age+",'"+gen+"',"+"'"+email+"'"+")");
					System.out.println();
					System.out.println("Congrats, You have added the user to the database Successfully.");
					System.out.println();
					System.out.println("Want to Add , Delete, Update the Users ?🤩🤩🤩 type \"yes\"");
					System.out.println();
					System.out.println("Or Want to Quit ?😭😭😭 type \"quit\"");
					String ch = sc.next();
					if(ch.equals("yes") || ch.equals("YES") || ch.equals("Yes"))
						contd = false;
					else
						contd = true;
					System.out.println();
					break;
				}
				case 2:{
					System.out.println("Enter the user id you want to delete");
					int id = sc.nextInt();
					stmt.execute("delete from emp where id="+id);
					System.out.println("You have deleted user Successfully.");
					System.out.println();
					System.out.println("Want to Add , Delete, Update the Users ?🤩🤩🤩 type \"yes\"");
					System.out.println();
					System.out.println("Or Want to Quit ?😭😭😭 type \"quit\"");
					String ch = sc.next();
					if(ch.equals("yes") || ch.equals("YES") || ch.equals("Yes"))
						contd = false;
					else
						contd = true;
					System.out.println();
					break;
				}
				
				case 3:{
					System.out.println("Enter the user id you want to update");
					int id = sc.nextInt();
					System.out.println("Enter what you want to update?");
					System.out.println("name,age,gender,email");
					String upd = sc.next();
					System.out.println("Give the data");
					if(upd=="age") {
						int age = sc.nextInt();
						stmt.execute("update emp set "+upd+"="+age+" where id="+id);
					}
					String data = sc.next();
					stmt.execute("update emp set "+upd+"='"+data+"' where id="+id);
					System.out.println("You have updated the user Successfully.");
					System.out.println();
					System.out.println("Want to Add , Delete, Modify the Users ?🤩🤩🤩 type \"yes\"");
					System.out.println();
					System.out.println("Or Want to Quit ?😭😭😭 type \"quit\"");
					String ch = sc.next();
					if(ch.equals("yes") || ch.equals("YES") || ch.equals("Yes"))
						contd = false;
					else
						contd = true;
					System.out.println();
					break;
				}
				
				default:{
					System.out.println("Please Select from the given Options.Enter Again!");
				}
				}
				
				if(contd) {
					System.out.println("We will be missing you a lot 😘😘😘 Do come back 😉😉😉 Bye 🤗🤗🤗");
					con.close();
					break;
				}
			}
			
			sc.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
