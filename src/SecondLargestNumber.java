

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {25,10,35,15,45};
		
		System.out.println("Actual array is:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		SecondLargestNumber obj = new SecondLargestNumber();
		obj.Ascending(arr);
		
	}
	
	void Ascending(int[] arr){	
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println("Array After sorting in Ascending order:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("The Second largest Element in Array is:"+arr[arr.length-2]);
		
		//System.out.println("The Second smallest Element in Array is:"+arr[1]);
	}

}
