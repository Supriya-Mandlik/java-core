

import java.util.Scanner;

public class Gradingsystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of the student:");
		int i = sc.nextInt();
		
		if (i<25) {
			
			System.out.println("Marks of the student is:"+i+" and Grade is : F");
			
		}else if ((i>=25)&&(i<=45)) {
			
			System.out.println("Marks of the student is:"+i+" and Grade is : E");
			
		}else if ((i>=45)&&(i<=50)) {
			
			System.out.println("Marks of the student is:"+i+" and Grade is : D");
			
		}else if ((i>=50)&&(i<=60)) {
			
			System.out.println("Marks of the student is:"+i+" and Grade is : C");
			
		}else if ((i>=60)&&(i<=80)) {
			
			System.out.println("Marks of the student is:"+i+" and Grade is : B");
			
		}
		else {

			System.out.println("Marks of the student is:"+i+" and Grade is : A");
			
		}
		
	}
}
	
	
	
	
			