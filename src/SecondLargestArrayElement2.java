

public class SecondLargestArrayElement2 {
	
	public static void main(String[] args) {
		
		int[] arr = {25,10,35,15,45};
		System.out.println("Given Array is:");
		for (int i : arr) {
			System.out.print(i+" ");
				
		}
		System.out.println();
		
		SecondLargestArrayElement2 obj = new SecondLargestArrayElement2();
	int val	=obj.Sort(arr);
		
	System.out.println("The Second Largest Element in Array is:"+val);	
		
	}
	
	int Sort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		return arr[arr.length-2];
	}

}
