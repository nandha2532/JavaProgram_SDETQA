package array;

public class EvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,2,8,4};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				System.out.println(a[i]+" is an even number");
			}
			else
				System.out.println(a[i]+" is an odd number");
		}
		
		//enhanced for loop
		
		System.out.println("Even numbers .....");
		for(int x:a) {
			if(x%2==0)
				System.out.println(x);
		}
		System.out.println("Odd numbers .....");
		for(int x:a) {
			if(x%2!=0)
				System.out.println(x);
		}
	}

}
