package fa_InterviewQn;

import java.util.Scanner;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NumOfDigits
		//Number Of Odd & even Digits
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		int num=n;
		while(num>0) {
			num=num/10;
			count++;
		}
		
		System.out.println("Number of Digits : "+count);
		
		int no = n;
		int even=0;
		int odd =0;

		
		while(no>0) {
			int digit=no%10;
			 
			if(digit%2==0) {
				even++;
			}
			else
				odd++;
			no=no/10;
		}
		
		System.out.println("Number of Even Digits : "+even);
		System.out.println("Number of Odd Digits : "+odd);
	}

}
