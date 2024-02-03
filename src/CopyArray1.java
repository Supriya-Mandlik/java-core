

public class CopyArray1 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		CopyArray1 obj = new CopyArray1();
		int[] arr2 = obj.copy(arr);
		 for (int i : arr2) {
			System.out.print(i+" ");
		}
		
	}
	
	int[] copy(int[] arr) {
		
		int[] arr2 = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			int val = arr[i];
			
			arr2[i] = val;
			
		}
		return arr2;
	}

}
