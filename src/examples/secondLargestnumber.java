package examples;

public class secondLargestnumber {
	
	public static void main(String[] args) {
		
		int[] arr = {10,25,35,15,45,40};
		
		int firstLargestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if (arr[i]>firstLargestNumber) {
				
				secondLargestNumber=firstLargestNumber;
				firstLargestNumber=arr[i];
				
					
			}else if (arr[i]>secondLargestNumber && arr[i]<firstLargestNumber) {
				secondLargestNumber=arr[i];
			}
			
		}
		System.out.println("second largest number is:"+secondLargestNumber);
	}

}
