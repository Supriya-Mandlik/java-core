package JavaCollectionFramework;
import java.util.ArrayList;

public class CollectionInterfaceMethods {
	
	// Collection Interface Methods
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);   // add() method
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		
		System.out.println(al.contains(200));  // contains() method
		System.out.println(al.contains(500));
		
		System.out.println(al.isEmpty());     // isEmpty() method
		
		System.out.println(al.size());     // size() method
		
	// al.remove(100);  // Arraylist remove() method here it will consider 100 as an index position
		
		al.remove(0);  // ArrayList remove() method
		
		
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("aaa");
		al2.add("bbb");
		al2.add("ccc");
		
		System.out.println(al2);
		
		al.addAll(al2);    // addAll() method
		
		System.out.println(al);
		
		al2.remove(0);   // remove() method collection
		
		al2.remove("bbb");   // remove() method collection
		
		System.out.println(al2);
		
		ArrayList al3 = new ArrayList();
		al3.add("aaa");
		al3.add("bbb");
		al3.add("ccc");
		
		ArrayList al4 = new ArrayList();
		al4.add("bbb");
		al4.add("ccc");
		al4.add("ddd");
		
		System.out.println(al3.containsAll(al4));  // containsAll() method
		
		al3.removeAll(al4);   // removeAll() method
		
		System.out.println(al3);
		System.out.println(al4);
		
		al4.clear();   // clear() method
		System.out.println(al4);
		
	}

}
