

import java.util.Scanner;

public class sum1 {
	
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=(n*(n+1))/2;
		System.out.println("sum is-"+sum);
	}

}
