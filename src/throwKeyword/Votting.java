package throwKeyword;

import java.util.Scanner;

public class Votting {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		try
		{
		if (age<18) {
			
			throw new YoungerAgeException("You are not eligible for votting!");
			
		} else {
			
			System.out.println("You are eligible for votting!");

		}
		}
		catch(YoungerAgeException yae) 
		{
			yae.printStackTrace();
			//System.out.println(yae);
		}
		
		System.out.println("End Successfully!");
		
	}
	
}
