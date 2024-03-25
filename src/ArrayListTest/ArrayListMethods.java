package ArrayListTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(0,500);      // properties of ArrayList
		al.add(10);         // add() method
		al.add("Deepak");
		al.add(40.123);
		al.add('s');
		al.add(null);
		al.add(10);
		al.add(7,null);
		System.out.println(al);  // it will print Collection object
		
		ArrayList al2 = new ArrayList();
		
		al2.add(120);
		al2.add("rahul");
		
		al.addAll(al2);    // addAll() method
		System.out.println(al);
		
		//al.remove("Deepak");     // remove() method
		//System.out.println(al);
		
		//al.remove(4);
		//System.out.println(al);
		
		//al.remove(0);
		//System.out.println(al);
		
		//al.removeAll(al2);     // removeAll() method
		//System.out.println(al);
		
		//al.clear();          // clear() method
		//System.out.println(al);
		
		System.out.println(al.contains(10));   // contains() method
		
		System.out.println(al.containsAll(al2));  // containsAll() method
		
		System.out.println(al.size());  // size() method
		
		System.out.println(al.get(0));   // get() method
		
		al.set(1, 300);          // set() method
		System.out.println(al);
		
		System.out.println(al.indexOf("Deepak"));  // indexOf() method
		
		 // iterator() method -> it will iterate Collection object one by one
		
		Iterator itr = al.iterator();    
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
