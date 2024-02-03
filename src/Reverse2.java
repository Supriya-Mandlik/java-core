

public class Reverse2 {
	
	public static void main(String[] args) {
		
		//Reverse Array in same array using swapping method
		
		int[] arr = {10,20,30,40,50,60};
		
		Reverse2 obj = new Reverse2();
		obj.ReverseArray(arr);
		
	}
	
	void ReverseArray(int[] arr) {
		
		int j = arr.length-1;
		
		for(int i=0;i<=(arr.length-1)/2;i++) {
			
			int val = arr[i];
			arr[i]=arr[j];
			arr[j] = val;
			j--;
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
