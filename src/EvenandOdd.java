package EvenandOdd;

import java.util.Scanner;

public class EvenandOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= sc.nextInt();
		
		if (n%2==0) {
			
			System.out.println("Entered number is Even");
			
		} else {
			
			System.out.println("Entered number is Odd");

		}
		
		
		
	}
	
	
	
	/*public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i%2 == 0) {
			System.out.println("Entered number is even");
			
		}else {
			System.out.println("Entered number is odd");
		}	
	}*/

}
