package array;

public class SumOfElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,6,2,8,4};
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		
		System.out.println("Sum of elements in Array : "+sum);
		
		int s=0;
		
		for(int x:a) {
			s=s+x;
		}
		System.out.println("Sum of elements in Array using for each loop : "+s);
	}

}
