package Assignment;

public class SumOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7};
		System.out.println("First Array is:");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Second Array is:");
		int[] arr2 = {0,0,2,1,3,5,2};
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		SumOfTwoArrays obj = new SumOfTwoArrays();
		System.out.println("Sum of Two Arrays is:");
		int[] sumarr = obj.sum(arr1, arr2);
		for (int i : sumarr) {
			System.out.print(i+" ");
		}
		
	}
	int[] sum(int[] arr1,int[] arr2) {
		
		int[] sumarr = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			
			sumarr[i]=arr1[i]+arr2[i];
			
		}
		return sumarr;
		
	}	
		
	}
	
	


