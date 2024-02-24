package examples;

import java.util.Arrays;

public class arraysortingmethod {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,6,9,24,5,10};
		
		Arrays.sort(arr);  //using sorting method
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);	
		}
		
	}

}
