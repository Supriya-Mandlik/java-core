package AssignmentCollectionFramework;

import java.util.ArrayList;

// Given an element write a program to check if element(value) exists in arraylist?

public class ArrayListContains {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Prachi");
		al.add("Prajakta");
		al.add("Sai");
		al.add("Shravani");
		al.add("Sarthak");
		
		System.out.println("ArrayList Elements are ::");
		System.out.println(al);
		
		System.out.println("Whether Shravani is Present or Not :");
         System.out.println(al.contains("Shravani"));		
	}

}
