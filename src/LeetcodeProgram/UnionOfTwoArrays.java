package LeetcodeProgram;

public class UnionOfTwoArrays {
	
	public static void main(String[] args) {
		
		System.out.println("First Array is:");
		int[] arr1 = {2,3,4,7,8,11};
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Second Array is:");
		int[] arr2 = {1,2,4,6,7,8,10,12};
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] arr = new int[arr1.length+arr2.length];
		
		UnionOfTwoArrays obj = new UnionOfTwoArrays();
		int k = obj.Union(arr1,arr2,arr);
		System.out.println("Union of Two Array is:");
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	int Union(int[] arr1,int[] arr2,int[] arr) {
		
		int i=0;
		int j=0;
		int k=0;
		
		while (i<arr1.length && j<arr2.length && k<arr1.length+arr2.length) {
			while ((i<arr1.length-1)&&(arr1[i]==arr1[i+1])) {
				i++;
			}
		while ((j<arr2.length-1)&&(arr2[j]==arr2[j+1])) {
			j++;
		}
		if (arr1[i]<arr2[j]) {
			arr[k]=arr1[i];
			i++;
			k++;
		}else if (arr1[i]>arr2[j]) {
			arr[k]=arr2[j];
			j++;
			k++;
		}else {
			arr[k]=arr1[i];
			i++;
			j++;
			k++;
		}
			
		}
		
		while (i<arr1.length && k<arr1.length+arr2.length) {
			if (i<arr1.length-1 && arr1[i]==arr1[i+1]) {
			i++;	
			}else {
				arr[k]=arr1[i];
				i++;
				k++;
			}
		}
		
		while (j<arr2.length && k<arr1.length+arr2.length) {
			if (j<arr2.length-1 && arr2[j]==arr2[j+1]) {
				j++;
			} else {
				arr[k]=arr2[j];
              j++;
              k++;
			}
		}
		return k;
	}

}
