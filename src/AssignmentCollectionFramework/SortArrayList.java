package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

// Write a java program to sort a given arrayList.
// How to sort element of list classes and keep duplicates?

public class SortArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(10);
		al.add(55);
		al.add(24);
		al.add(75);
		
		System.out.println("ArrayList Elements are ::");
		System.out.println(al);
		
		Collections.sort(al); // Collections.sort() method -> sort in ascending order
		
		System.out.println("ArrayList Elements After Sorting in Ascending Order ::");
		System.out.println(al);
	
		
	}

}
