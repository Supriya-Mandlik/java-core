package Assignment;

public class SumOfEvenAndOddNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Given Array is:");
		int[] arr = {1,2,3,4,5,6,7};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		SumOfEvenAndOddNumbers obj = new SumOfEvenAndOddNumbers();
		obj.sum(arr);
		
	}
	void sum(int[] arr) {
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if ((arr[i]%2)==0) {
				even = even+arr[i];
			}
			else if ((arr[i]%2)!=0) {
				odd = odd+arr[i];
			}
		}
		
		System.out.println("Addition of even numbers is:"+even);
		System.out.println("Addition of odd numbers is:"+odd);
	}
	

}
