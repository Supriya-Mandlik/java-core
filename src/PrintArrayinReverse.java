

public class PrintArrayinReverse {
	public static void main(String[] args) {
		
		
		
		int[] arr = {30,20,10,40,50,90,100,80,60,70};
		
		 PrintArrayinReverse obj = new PrintArrayinReverse();
				 //obj.test(arr);
				 obj.FindMinandMaxElement(arr);
		
	}
	void FindMinandMaxElement(int[] arr) {
		
		System.out.println("Write the Minimum and Maximum Element of the array-");
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			if (val<min) {
				min=val;
			}
			if (val>max) {
				max=val;
				
			}
			System.out.println(arr[i]);
			
		}
		
		System.out.println("minimum value is-"+min);
		System.out.println("maximum value is-"+max);
	}
	
	
	
void test(int[] arr) {
	
	System.out.println("Print Array in Reverse-");
	
	for(int i=(arr.length-1);i>=0;i--) {
		
		System.out.println(arr[i]);
		
	}
	
	System.out.println("Print Alternate Elements in Array-");
	for(int i=0;i<arr.length;i=i+2) {
		
		System.out.println(arr[i]);
		
	}
}
}
