package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

//How to sort element of List classes and remove duplicates?

public class SortArrayListRemoveDuplicates {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(23);
		al.add(45);
		al.add(13);
		al.add(76);
		
		System.out.println("Given ArrayList is-");
		System.out.println(al);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println("After sorting And Removing duplicates-");
		System.out.println(ts);
		
		System.out.println("Using Iterator:");
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()){
			int val = itr.next();  // Converting object into Primitive Values
			System.out.println(val);
		}
		
		
	}

}
