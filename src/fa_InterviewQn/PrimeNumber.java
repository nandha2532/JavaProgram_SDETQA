package fa_InterviewQn;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		isPrime(n);
		
//		boolean flag = false;
//		for(int i=2;i<n/2;i++) {
//			
//			if(n%i==0) {
//				flag = true;
//				break;
//			}	
//		}
//		if(flag)
//			System.out.println(n+"is not a prime number");
//		else
//			System.out.println(n+"is a prime number");
		
		
				
	}
	
	static void isPrime(int num) {
		int count=0;
		if(num>1) {
			
			for(int i=2;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(num+" is a prime number");
			}
			else
				System.out.println(num+" is not a prime number  5");
			
		}
		else
			System.out.println(num+" is not a prime number");
	}

}
