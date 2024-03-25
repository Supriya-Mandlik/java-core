package JavaCollectionFramework;
import java.util.Iterator;
import java.util.LinkedHashSet;

// in LinkedHashSet Insertion order is maintained.
//We can iterate LinkedHashSet objects through for each loop and iterator() method only

public class LinkedHashSetTest {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Supriya");
		lhs.add("Kiran");
		lhs.add("Saurabh");
		lhs.add("Advik");
		lhs.add("Anvika");
		lhs.add("Kiran");  // we can not store duplicate values
		lhs.add(null);
		
		
		System.out.println(lhs);
		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		
		for (String st : lhs) {
			System.out.println(st);
		}
	}

}
