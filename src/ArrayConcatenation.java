

public class ArrayConcatenation {
	
	public static void main(String[] args) {
		 
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int a1 =arr1.length;
		int a2 = arr2.length;
		
		int a = a1 + a2;
		int[] arr = new int[a];
		
		for(int i = 0;i<a1;i++) {
			arr[i]=arr1[i];
			
		}
		
		for(int i=0;i<a2;i++) {
			arr[a1+i] = arr2[i];
			
		}
		
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
