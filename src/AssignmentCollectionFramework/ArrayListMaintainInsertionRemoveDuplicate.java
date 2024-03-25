package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

// How to remove duplicate element of list class and maintain insertion order?

public class ArrayListMaintainInsertionRemoveDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(35);
		al.add(67);
		al.add(5);
		al.add(35);
		al.add(100);
		al.add(5);
		
		System.out.println("Given ArrayList is-");
		System.out.println(al);
		
	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
	System.out.println("After Removing duplicates and Maintaining insertion order-");
	System.out.println(lhs);
	
	System.out.println("Using Iterator-");
	Iterator<Integer> itr = lhs.iterator();
	while(itr.hasNext()) {
		int val = itr.next();
		System.out.println(val);
	}
	
		
	}

}
