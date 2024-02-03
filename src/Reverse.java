

public class Reverse {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40};
		
		Reverse obj = new Reverse();
		int[] arr2 = obj.ReverseArray(arr);
		for (int i : arr2) {
			System.out.print(i+" ");
		}
	}
	
	int[] ReverseArray(int[] arr) {
		
		int[] arr2 = new int[arr.length];
		
		int j = 0;
		
		for(int i=(arr.length-1);i>=0;i--) {
			
			int val = arr[i];
			
			arr2[j] = val;
			
			j++;
		}
		
		return arr2;
	}
	

}
