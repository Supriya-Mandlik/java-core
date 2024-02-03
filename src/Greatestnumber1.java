

import java.util.Scanner;

public class Greatestnumber1 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first value-");
	int i= sc.nextInt();
	
	System.out.println("Enter second value:");
	int j= sc.nextInt();
	
	if(i>j) {
		System.out.println("The Greatest Value is:"+i);
	}else {
		System.out.println("The Greatest Value is:"+j);
	}
}
}
	


