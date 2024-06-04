/*
// Factorial.

import java.util.*;

public class task_practice {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;

        for (int i = 2; i <= n; i++) {
            temp *= i;  // Corrected line: Multiply temp by i in each iteration
        }

        System.out.println(temp);
        sc.close();
    }
}
*/

//reverse a number
import java.util.*;

public class task_practice {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
	while(n!=0){
	int r = n%10;
	sum += r*pow();


	}
        sc.close();
    }
}

