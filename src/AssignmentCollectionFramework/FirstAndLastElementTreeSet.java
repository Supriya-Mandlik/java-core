package AssignmentCollectionFramework;

import java.util.TreeSet;

// Write a java program to get the first and last element in treeset?

public class FirstAndLastElementTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(120);
		ts.add(1);
		ts.add(34);
		ts.add(87);
		ts.add(55);
		System.out.println("Given TreeSet::");
		System.out.println(ts);
		
		System.out.println("First Element is::");
		System.out.println(ts.first());	
		
		System.out.println("Last Element is::");
		System.out.println(ts.last());
		
		
	}

}
