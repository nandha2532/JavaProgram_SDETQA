package fa_InterviewQn;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		//String concatenation method
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev= rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is : "+rev);

		//Char array
		
		char a[]= s.toCharArray();
		
		String rev1="";
		for(int i=a.length-1;i>=0;i--) {
			rev1=rev1+a[i];
		}
		
		System.out.println("using Char array Reverse String is : "+rev1);
		
		//using StringBuffer class
		StringBuffer sb =new  StringBuffer(s);
		System.out.println("using StringBuffer Reverse String is : "+sb.reverse());
		
	}

}
