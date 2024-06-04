package pack1;

public class primeNumber {
	public static void main(String[] args) {
		int a = 100;
		for(int i = 2;i<=100;i++) {
			for(int j = 2;j<=i;j++) {
				if(i%j==0) {
					System.out.println();
				}
			}
		}
	}
}
