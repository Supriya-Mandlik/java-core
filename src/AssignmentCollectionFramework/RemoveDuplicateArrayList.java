package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

// Remove Duplicate From ArrayList

public class RemoveDuplicateArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Kiwi");
		al.add("Apple");
		al.add("Mango");
		al.add("Kiwi");
		System.out.println("Given ArrayList::");
		System.out.println(al);
		
		/*HashSet<String> hs = new HashSet<String>(al);
		System.out.println("Converting ArrayList To HashSet ::");
		System.out.println(hs);
		
		al.clear();
		al.addAll(hs);
		System.out.println("After Removing duplicates from ArrayList::");
		System.out.println(al);*/
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(al);
		System.out.println("Converting ArrayList To LinkedHashSet ::");
		System.out.println(lhs);
		
		al.clear();
		al.addAll(lhs);
		System.out.println("After Removing duplicates from ArrayList::");
		System.out.println(al);
		
	}

}
