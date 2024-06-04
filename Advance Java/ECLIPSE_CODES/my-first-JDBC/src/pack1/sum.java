package pack1;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hello");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println(a+" +"+" "+b+" = "+sum);
		
		sc.close();
	}
}
