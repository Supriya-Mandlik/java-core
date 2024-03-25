package AssignmentCollectionFramework;

import java.util.ArrayList;
import java.util.StringJoiner;

// How to convert ArrayList to String?

public class ArrayListToString {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ramesh");
		al.add("Suresh");
		al.add("Mukesh");
		al.add("Ram");
		al.add("Shyam");
		
		System.out.println("Given ArrayList::");
		System.out.println(al);
		
		StringJoiner sj = new StringJoiner(",");
		for (String str : al) {
			sj.add(str);
		}
		System.out.println("After Converting ArrayList to String::");
		System.out.println(sj);
		
	}

}
