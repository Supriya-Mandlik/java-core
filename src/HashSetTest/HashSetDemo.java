package HashSetTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// in HashSet Insertion order is not maintained.
// We can iterate HashSet objects through for each loop and iterator() method only

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(200);
		al.add(300);
		al.add(400);
		
		HashSet hs = new HashSet();
		
		// Properties and Methods
		// it contains all the methods of Collection Interface
		
		// it is not an indexed based data structure.
		// it stores the data according to their hashcode values
		hs.add(10);   // it can store heterogenous elements
		hs.add("deepak");  
		hs.add(100.55);     // add() method
		hs.add("xyz");
		hs.add(true);
		hs.add(null);  
		hs.add("deepak"); // it does not store duplicate values
		hs.add(null);   // it store only one null value
		
		hs.addAll(al);   // addAll() method
		
		System.out.println(hs.contains(300));    // contains() method
		System.out.println(hs.containsAll(al));  // containsAll() method
		System.out.println(hs.size());           // size() method
		hs.remove("deepak");                    // remove() method
		
		System.out.println(hs); // it does not follows insertion order
		
		HashSet hs2 = new HashSet();
		hs2.add(30);
		hs2.add(10);
		hs2.add(20);
		hs2.add(40);
		
		System.out.println(hs2);  // it does not follows the sorting order
		
		hs2.clear();              // clear() method
		System.out.println(hs2);
		
		Iterator itr = hs2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// constructor
		
		HashSet hs3 = new HashSet(al);   // HashSet(Collection c)
		System.out.println(hs3);
		
		HashSet hs4 = new HashSet();  // HashSet()
		
		
	}

}
