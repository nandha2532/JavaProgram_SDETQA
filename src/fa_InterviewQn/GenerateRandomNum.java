package fa_InterviewQn;

import java.util.Random;

public class GenerateRandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Random class
		Random r = new Random();
		int rNum=r.nextInt(100);
		
		System.out.println(rNum);
		
		double db= r.nextDouble();
		System.out.println(db);
		
		//Math class
		System.out.println(Math.random());
		
		//Apache Commons lang API
		
	}

}
