package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

//Write a java program to sort arrayList in Descending order.

public class SortArrayListInDescending {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(10);
		al.add(55);
		al.add(24);
		al.add(75);
		
		System.out.println("ArrayList Elements are ::");
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder()); // Descending order
		
		System.out.println("ArrayList Elements After Sorting in Descending Order ::");
		
		System.out.println(al);
		
	}

}
