package JavaCollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DiffBetweenIteratorAndListIterator {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		
		System.out.println(l);  // it prints collection object
		
		System.out.println("*************Iterator**************");
		// it iterate elements from object one by one
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("*************ListIterator**************");
		// it iterate elements from object one by one
		
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());

		}
		
	   // li.add(100);   // it add element in object
		//System.out.println(l);
		
		li.set(200);  // it replace the last element (i.e. rahul by 200)
	   System.out.println(l);
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		// OR
		
		System.out.println("*----------------*");
		
      List l2 = new ArrayList();
		
		l2.add(10);
		l2.add("deepak");
		l2.add("rahul");
		
		ListIterator li2 = l.listIterator();
		// transferring cursor to last
		li2.next();
		li2.next();
		li2.next();
		
		while(li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
		
		
		
	}

}
