import java.util.Scanner;

class class1{
public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int x = 1;
	for(int i =a;i>1;i--){
	if(isPrime(i)){
	
	if(x==2){
	System.out.println("This is a prime number "+i);
	break;
	x++;
}
	}
	}
	sc.close();

}
public static boolean isPrime(int n){
	for(int i=2;i<=n/2;i++){
	if(n % i == 0)
	return false;	
}
return true;
}
}

// remove dulicate values
// remove duplicate wprds
// anagram
// panagram
// string occurance