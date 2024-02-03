

public class SortAscendingArray {
	
	public static void main(String[] args) {
		
		 int[] arr = {0,23,14,12,9};
		 
		 System.out.println("Given Array is:");
		 for (int i : arr) {
			 
			System.out.print(i+" ");
		}
		 
		 SortAscendingArray obj = new SortAscendingArray();
		 obj.Ascending(arr);
	}
	
	void Ascending(int[] arr) {
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
	              temp = arr[i];
	              arr[i]=arr[j];
	              arr[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.println();
		System.out.println("Array After sorting in Ascending Order:");
		for (int val : arr) {
			System.out.print(val+" ");
		}
	}

}
