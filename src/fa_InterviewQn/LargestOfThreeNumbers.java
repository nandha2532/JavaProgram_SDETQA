package fa_InterviewQn;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number : ");
		int c = sc.nextInt();
		
		sc.close();
		

		//Using if class
		
		if(a>b && a>c){
			System.out.println(a+" is the largest Number");
		}
		
		else if(b>a && b>c) {
			System.out.println(b+" is the largest Number");
		}
		
		else{
			System.out.println(c+" is the largest Number");
		}
		
		
		//Using ternary operator
		System.out.println("Using Ternary Operator");
		int largest;
//		int large = a>b?a:b; //Largest of a & b
//		
//		largest = large>c?large:c; //Largest of c & large
		
		
		largest = (a>b?a:b)>c?(a>b?a:b):c;
		
		System.out.println(largest+" is the largest Number");
	}

}
