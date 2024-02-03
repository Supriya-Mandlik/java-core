



public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		
		System.out.println("Given Array is:");
		for(int i=0;i<arr.length;i++) {
			
			int val = arr[i];
			System.out.print(val);
			System.out.print(" ");
		}
	
		System.out.println();
		System.out.println("Reverse Array is:");
		for(int i=(arr.length-1);i>=0;i--) {
			
			int val = arr[i];
			System.out.print(val);
			System.out.print(" ");
			
		}
		
			}

}
