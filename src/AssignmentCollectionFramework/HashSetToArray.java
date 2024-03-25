package AssignmentCollectionFramework;

import java.util.HashSet;

// Write a program to convert HashSet to Array?

public class HashSetToArray {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Advik");
		hs.add("Anvika");
		hs.add("Saurabh");
		hs.add("Kiran");
		hs.add("Kavya");
		
		System.out.println("HashSet Values are::");
		System.out.println(hs);
		
		// converting HashSet into Array
		String[] arr = new String[hs.size()];   // declaring array
		
		/*
		int i=0;
		for (String str : hs) {
			arr[i]=str;
			i++;
		}
		
		// iterating array
		System.out.println("Converting HashSet into Array::");
		for (String st : arr) {
			System.out.print(st+" ");
		}*/
		
		System.out.println("Converting HashSet into Array::");
		hs.toArray(arr);    // toArray method
		for (String str : arr) {
			System.out.print(str+" ");
		}
		
	}

}
