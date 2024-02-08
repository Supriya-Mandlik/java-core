package LeetcodeProgram;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {2,2,3,3,4,6,6};
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
			int rd = obj.removeduplicate(arr);
			System.out.println();
			for(int i=0;i<rd;i++) {
				System.out.print(arr[i]+" ");
			}	
		
	}
		
		 int removeduplicate(int[] arr) {
			
			int rd = 0;
			for(int i=1;i<arr.length;i++) {
				if(arr[rd]!=arr[i]) {
					rd++;
					arr[rd]=arr[i];
				}	
			}
			return rd+1;
		}
		
	}
	

