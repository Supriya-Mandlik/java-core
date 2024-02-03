

import java.util.Scanner;

public class sum2 {
	
	public static void main(String[] args) {
		System.out.println("Sum of natural numbers");
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
	
		for(int i=n;i>=1;i--) {
			sum=sum+i;
	
		}
		System.out.println("sum is-"+sum);
		
		/*while (i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum is-"+sum);*/
	}	
	}

