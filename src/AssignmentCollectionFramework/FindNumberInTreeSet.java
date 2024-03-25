package AssignmentCollectionFramework;

import java.util.TreeSet;

// Write a java program to find the Numbers less than 7 in a Treeset?

public class FindNumberInTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(8);
		ts.add(9);
		ts.add(10);
		System.out.println("TreeSet::");
		System.out.println(ts);
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2 = (TreeSet)ts.headSet(7);
		
		System.out.println("Elements Less than 7::");
		System.out.println(ts2);
		
	}

}
