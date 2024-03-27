package LambdaExpressionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorClassSortTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(24);
		al.add(34);
		al.add(0);
		al.add(87);
		
		System.out.println("ArrayList Object:");
		System.out.println(al);
		
		System.out.println("Sorting in Ascending Order:");
		Collections.sort(al);   // using Collections.sort() method
		//Collections.sort(al,(a,b)->a-b);   // we can write this also
		System.out.println(al);
		
		System.out.println("Sorting in Descending Order:");
		Collections.sort(al,(a,b)->b-a);  // using Comparator object and lambda.
		System.out.println(al);
		
		System.out.println("*--------------------------*");
		
		Set<Integer> s= new TreeSet<Integer>();  // it sort in Ascending order
		s.add(100);
		s.add(24);
		s.add(34);
		s.add(0);
		s.add(87);
		System.out.println("TreeSet Before Manual Sorting:");
		System.out.println(s);
		
		Set<Integer> s1= new TreeSet<Integer>((a,b)->b-a);  // we pass Comparator.it sort in reverse order
		s1.add(100);
		s1.add(24);
		s1.add(34);
		s1.add(0);
		s1.add(87);
		System.out.println("TreeSet After Manual Sorting:");
		System.out.println(s1);
		
		
	}

}
