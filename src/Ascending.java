

public class Ascending {
	
	public static void main(String[] args) {
		int[] arr = {7,0,2};
		
		System.out.println("Given Array is:");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		Ascending obj = new Ascending();
		obj.Sort(arr);
	}
	
	void Sort(int[] arr) {
		
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
		System.out.println("Array After Sorting in Ascending Order:");
		for (int val : arr) {
			System.out.print(val+" ");
		}
	}

}
