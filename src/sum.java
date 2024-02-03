

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
	sum obj = new sum();
	//obj.sum1();
	obj.SumusingScanner();
	}
	
	void SumusingScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array-");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		System.out.println("Array is-");
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			sum=sum+arr[i];	
		}
		System.out.println("Array is-");
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Sum of all the elements of an array is-"+sum);
		float average = sum/n;
		System.out.println("Average of array is-"+average);
	}
	
	void sum1() {

		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		System.out.println("array is-");
		for(int i =0;i<arr.length;i++) {
			
		sum=sum+arr[i];	
		System.out.print(arr[i]+" ");
		
		}
		
		System.out.println("");
		System.out.println("sum of all the elements of an array is-"+sum);
	}	

}
