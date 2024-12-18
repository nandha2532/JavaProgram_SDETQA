package fa_InterviewQn;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1;
		int n=10;
		int sum;
		System.out.print(a+" "+b);
		
		for(int i=2;i<=n;i++) {
			sum =a+b;
			System.out.print(" "+sum);
			
			a=b;
			b=sum;
			
		}
	}

}
