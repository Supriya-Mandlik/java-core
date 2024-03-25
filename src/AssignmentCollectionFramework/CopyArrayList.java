package AssignmentCollectionFramework;

import java.util.ArrayList;

// Write a java program to copy one ArrayList of String into another

public class CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Advik");
		al.add("Anvika");
		al.add("Vrushabh");
		al.add("Sanvi");
		al.add("Kavya");
		
		System.out.println("First Array List::");
		System.out.println(al);
		
		/*ArrayList<String> al2 = new ArrayList<String>(al);
		System.out.println("Second ArrayList is ::");
		System.out.println(al2);*/
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.addAll(al);
		System.out.println("Second ArrayList is ::");
		System.out.println(al2);
		
	}
	
}
