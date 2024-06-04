package com.org.controller;
import java.util.List;
import java.util.Scanner;


import com.org.dao.EmployeeDao;
import com.org.dto.Employee;
public class EmployeeController {

	public static void main(String[] args) {

		EmployeeDao empdao = new EmployeeDao();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean exit= false;
			System.out.println("Welcome to Home Page ~~~\n");
			System.out.println("Select from the given options:-");
			System.out.println("1.Save a new User");
			System.out.println("2.Check Email and pwd are same or not");
			System.out.println("3.Fetch all the datas");
			System.out.println("4.Delete a User");
			System.out.println("5.Fetch a particular User details");
			System.out.println("6.Update a User");
			System.out.println("7.To exit.");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:{
//			Insert to the database
				Employee emp = new Employee();
				System.out.println("Enter Id to insert");
				emp.setId(sc.nextInt());
				System.out.println("Enter Name to insert");
				emp.setName(sc.next());
				System.out.println("Enter Age to insert");
				emp.setAge(sc.nextInt());
				System.out.println("Enter Email to insert");
				emp.setEmail(sc.next());
				System.out.println("Enter Password to insert");
				emp.setPassword(sc.next());
				System.out.println("Enter Salary to insert");
				emp.setSalary(sc.nextLong());
				
				String msg = empdao.save(emp);
				System.out.println(msg);
				break;
			}
			case 2:{
//				checks whether email and pwd are same
				
				
				System.out.println("Enter Email to insert");
				String email = sc.next();
				System.out.println("Enter Password to insert");
				String pwd = sc.next();
				boolean b = empdao.fetchByEmailAndPassword(email, pwd);
				if(!b)
				System.out.println("Either your email or password is wrong.");
				else
					System.out.println("You have entered both of the inputs correct");
				break;
			}
			case 3:{
//				Fetching all the datas
				
				List<Employee> list = empdao.fetchAll();
				for(Employee l : list) {
					System.out.println("Id:- "+l.getId());
					System.out.println("Name:- "+l.getName());
					System.out.println("Age:- "+l.getAge());
					System.out.println("Email:- "+l.getEmail());
					System.out.println("Password:- "+l.getPassword());
					System.out.println("Salary:- "+l.getSalary());
					System.err.println("-----------------------------");
				}
				break;
			}
			case 4:{
//				Deleting by Id
				
				System.out.println("Give the id");
				int id = sc.nextInt();
				empdao.deleteById(id);
				System.out.println("User by "+id+" deleted");
				
				break;
			}
			case 5:{
//				Fetching By Id
				
				System.out.println("Give the id");
				int id = sc.nextInt();
				Employee emp = empdao.fetchById(id);
				System.out.println("Id:- "+emp.getId());
				System.out.println("Name:- "+emp.getName());
				System.out.println("Age:- "+emp.getAge());
				System.out.println("Email:- "+emp.getEmail());
				System.out.println("Password:- "+emp.getPassword());
				System.out.println("Salary:- "+emp.getSalary());
				
				break;
			}
			case 6:{
//			Update a user
				System.out.println("Give the id");
				int id = sc.nextInt();
				int rows = empdao.updateById(id);
				System.out.println(rows+" number of rows affected.");
				break;
			}
			
			case 7:{
				System.out.println("You have exited successfully.");
				exit= true;
				break;
			}
			}
			if(exit)
				break;
			System.out.println();
				
		}
	}
}


