

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array-");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is-");
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Even numbers-");
		for(int i=0;i<n;i++) {
			if((arr[i]%2)==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd numbers-");
		for(int i=0;i<n;i++) {
			if((arr[i]%2)!=0) {
				System.out.print(arr[i]+" ");
			}
		}
}

}
