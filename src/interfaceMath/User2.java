package interfaceMath;

import java.util.Scanner;

public class User2 implements Math {
	
	
	@Override
	public void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int a = sc.nextInt();
		System.out.println("Enter second number-");
		int b= sc.nextInt();
		int c= a+b;
		System.out.println("Addition is:"+c);
		
		
	}

	@Override
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number-");
		int a = sc.nextInt();
		System.out.println("Enter second number-");
		int b= sc.nextInt();
		int c= a-b;
		System.out.println("Substraction is:"+c);
		
	}

}
