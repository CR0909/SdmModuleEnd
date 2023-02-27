import java.util.Scanner;

public class FactorialProject {
	
	static int myFactorial(int n){
		if(n == 1 || n == 0) {
			return 1;
		}
		
		int fact = n * myFactorial(n-1);
		
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int ans = myFactorial(num);
		System.out.println("Factorial of a number: "+ans);
	}
	
}

