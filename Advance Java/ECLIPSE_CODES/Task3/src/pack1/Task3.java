package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_second_jdbc","root","root");
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Give the id number you want to register or update");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Enter id then name and finally age");
				int id = sc.nextInt();
				String name = sc.next();
				int age = sc.nextInt();
				PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?);");
				pst.setInt(1,id);
				pst.setString(2,name);
				pst.setInt(3,age);
				pst.execute();}
			else {
				System.out.println("Enter what data,value,id.");
				String data = sc.next();
				String s;
				
				int v;
				PreparedStatement pst;
				if(data=="name") {
					 pst = con.prepareStatement("update emp set ? = '?' where id = ?");
					pst.setString(1,data);
					s  = sc.next();
					pst.setString(2, s);
				}
				else {
					pst = con.prepareStatement("update emp set ? = ? where id = ?");
					pst.setString(1,data);
					v = sc.nextInt();
					pst.setInt(2, v);
				}
				System.out.println("Enter id");
				int id=sc.nextInt();
				pst.setInt(3,id);
				pst.execute();
			}
			
			
			
			
			
			
			System.out.println("Data inserted successfully");
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
