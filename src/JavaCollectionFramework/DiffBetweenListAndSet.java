package JavaCollectionFramework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class DiffBetweenListAndSet {
	
	// Difference Between List And Set
	
	public static void main(String[] args) {
	
		System.out.println("**********List***********");
		
		List l = new ArrayList(); // List-Interface and ArrayList-Implemented class
		//l.add(5,10);     // Store data according to index position
	    l.add(0,100);	   // l.add(100);
		l.add(200);       // l.add(1,200)
		l.add(300);
		l.add(400);
		l.add(300);
		l.add(400);   // store/allow duplicates
		l.add(null);
		l.add(null);  // store/allow multiple null
		System.out.println(l);  // display data according to index position
		
		System.out.println("Using Iterator");
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using ListIterator in forword direction");
		ListIterator litr = l.listIterator();
        while(litr.hasNext()) {
           System.out.println(litr.next());			
		}
		
		System.out.println("Using ListIterator in backword direction");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		// we can iterate List with iterator and listIterator
		
		System.out.println("**********Set***********");
		
		Set s = new HashSet();  // Set-Interface and HashSet-Implemented class 

		s.add(100);      // Store data according to HashCode values
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(300);
		s.add(400);  // does not store duplicates
		s.add(null);
		s.add(null);   // it allows only one null
		System.out.println(s);  // display data according to HashCode values
		
		System.out.println("Using Iterator");
		Iterator itr2 = s.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// we can iterate set with iterator only
	}

}
