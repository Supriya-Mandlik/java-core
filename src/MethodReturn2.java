

import java.util.Scanner;

public class MethodReturn2 {
	public static void main(String[] args) {
		
	    //hasNextInt() method: 
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value-");
		boolean res = sc.hasNextInt();
		if (res) {
			int val = sc.nextInt();
			System.out.println(val);
		}
		System.out.println(res);*/
		
		MethodReturn2 obj = new MethodReturn2();
		int result =obj.Addition(10, 20);
		System.out.println("Addition of two numbers is:"+result);
		
	}
  int Addition(int val1,int val2) {
	   
	  int res = val1+val2;
	  
	  return res;
	  
  }
}
