

import java.util.Scanner;

public class PositiveorNegative {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int i= sc.nextInt();
		
		if (i>0) {
			
			System.out.println("Entered number is Positive:"+i);
			
		}else if (i<0) {
			
			System.out.println("Entered number is Negative:"+i);
			
		}
		else {
			
			System.out.println("Entered number is zero");

		}
		
	}
	
}
	
	
	


