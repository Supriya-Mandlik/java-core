

public class ForEachLoop {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("Array value iteration using for loop-");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Array value iteration using for each loop-");
		for (int i : arr) {
			
			System.out.println(i);
			
		}
		
		for(int val : arr) {
			
			System.out.println(val);
			
		}
		
	}

}
