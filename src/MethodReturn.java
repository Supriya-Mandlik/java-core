

import java.util.Scanner;

public class MethodReturn {
	
	public static void main(String[] args) {
		
		MethodReturn obj = new MethodReturn();
		int result = obj.Addition();
		System.out.println("Addition is :"+result);
		
	}

	int Addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values for addition:");
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		int res = val1+val2;
		
		return res;
		
	}
}
