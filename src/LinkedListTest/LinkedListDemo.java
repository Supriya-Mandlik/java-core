package LinkedListTest;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		// Properties
		ll.add("deepak");
		ll.add("rahul");
		ll.add(105);
		ll.add(204.25);
		ll.add('c');
		ll.add(null);
		ll.add("deepak");
		ll.add(null);
		
		System.out.println(ll);
		
		// Methods
		
		//ll.addFirst(100);    // addFirst() method
	//	System.out.println(ll);
		
		//ll.addLast(1000);    // addLast() method
		//System.out.println(ll);
		
		//ll.removeFirst();     // removeFirst() method
		//System.out.println(ll);
		
		//ll.removeLast();     // removeLast() method
		//System.out.println(ll);
		
		//System.out.println(ll.getFirst());  // getFirst() method
		//System.out.println(ll.getLast());    // getLast() method
		
		// Constructors
		
		LinkedList ll1 = new LinkedList();   // 1] empty constructor
		ll1.add(10);
		ll1.add(20);
		System.out.println(ll1);
		
		LinkedList ll2 = new LinkedList(ll1);// 2] LinkedList(Collection c)
		ll2.add(100);
		ll2.add(200);
		System.out.println(ll2);
		
	}

}
