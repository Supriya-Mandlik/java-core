package AssignmentCollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

// write a java program to iterate a linked list in reverse order.

public class LinkedListIterationInReverse {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println("LinkedList Elements are ::");
		System.out.println(ll);
		
		System.out.println("LinkedList Elements in reverse Order ::");
		
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext()) {
			litr.next();
		}
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
      	
	}

}
