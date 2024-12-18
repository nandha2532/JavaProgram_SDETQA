package fa_InterviewQn;

import java.util.Scanner;

public class RevesrseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		//1 using algorithm
		int rev = 0;
		while(num!=0) {
			rev= rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is : "+ rev);
		
		// String Buffer class method
		
		//String.valueOf(num) --> will convert int to String
		
		StringBuffer rev1 = new StringBuffer(String.valueOf(num));
		rev1=rev1.reverse();
		System.out.println("Reverse number using StringBuffer : "+ rev);
		
		
		//Using StringBuilder
		
		StringBuilder rev2 = new StringBuilder();
		rev2.append(num);
		rev2= rev2.reverse();
		
		System.out.println("Reverse number using StringBuilder : "+ rev);
	}

}
