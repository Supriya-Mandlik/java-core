package AssignmentCollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

//Write a java program to iterate through all the elements in a linked list using iterator and for each loop.

public class LinkedListIteration {
	
	public static void main(String[] args) {
		  
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		System.out.println(ll);
		
		System.out.println("LinkedList Iteration using for each loop ::");
		
		for (Integer val : ll) {
			System.out.println(val);
		}
		
		System.out.println("LinkedList Iteration using Iterator ::");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
