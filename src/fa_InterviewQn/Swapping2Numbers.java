package fa_InterviewQn;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20;
		
		System.out.println("Before swapping values are  :"+a+"  "+b);
		
		
		//Third variable
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping values are  :"+a+"  "+b);
		
		//using + & - (without temp variable )
		
		a= a+b;	//10+20 =30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20
		
		System.out.println("After swapping values are  :"+a+"  "+b);
		
		//using + & - (without temp variable )
		//here a & b values should not be 0
		
		a=a*b;	//10*20= 200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20
		
		System.out.println("After swapping values are  :"+a+"  "+b);
		
		//using bitwise operator XOR(^)
		a=a^b;	// ^ caret will convert decimal to binary(1010)
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping values are  :"+a+"  "+b);
		
		//Single statement
		
		b=a+b-(a=b); //execution will always begin from right to left
		// First b assigned to a 
		// Then from  a+b  - a(the value of b)
		System.out.println("After swapping values in 1step are  :"+a+"  "+b);

		
		
	}

}
