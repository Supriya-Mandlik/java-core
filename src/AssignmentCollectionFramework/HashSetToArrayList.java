package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

// Write a java program to convert a HashSet to a ArrayList?

public class HashSetToArrayList {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Kiran");
		hs.add("Saurabh");
		hs.add("Kavya");
		hs.add("Anvika");
		hs.add("Kiran");
		hs.add("Kavya");
		System.out.println("HashSet ::");
		System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<String>(hs);
	System.out.println("Converting HashSet to ArrayList::");
		System.out.println(al);
		
	}

}
