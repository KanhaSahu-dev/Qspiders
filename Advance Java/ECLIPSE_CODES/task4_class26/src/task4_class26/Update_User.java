package task4_class26;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;
public class Update_User {

	public static void main(String[] args) {
		try {
			//Scanner Class Declaration
			Scanner sc = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment4_class26","root","root");
			
			PreparedStatement pst = con.prepareStatement("select * from emp where length(password)=4");
			ResultSet rst =  pst.executeQuery();
			int count = 0;
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			while(rst.next()) {
				count++;
				arr.add(rst.getInt("id"));
			}
			for(int i = 0;i<count;i++) {
				System.out.println(count-i+" passwords remaining to be updated.");
				
				System.out.println("Give the value");
				String value = sc.nextLine();
				pst = con.prepareStatement("update emp set password = replace(password,substring(password,1,1),?) where id="+arr.get(i));
				pst.setString(1, value);
				int x = pst.executeUpdate();
			}
			System.out.println();
			System.out.println("You have updated all the passwords successfully.");
			con.close();
			sc.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}