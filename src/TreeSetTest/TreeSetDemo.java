package TreeSetTest;

import java.util.TreeSet;

public class TreeSetDemo {
	
	// in TreeSet we get elements in sorted order
	// We can iterate TreeSet objects through for each loop and iterator() method only
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(40);
		ts.add(60);
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		
		System.out.println(ts);   // it follows sorting order but does not follows insertion order
		
		ts.remove(20);            // remove()
		System.out.println(ts);
		
		ts.clear();               // clear()
		System.out.println(ts);

		TreeSet ts2 = new TreeSet();
		
		ts2.add("deepak");
		ts2.add("amit");
		ts2.add("rahul");
		ts2.add("deepesh");
		ts2.add("kamal");
		//ts2.add(10);    // it stores only Homogeneous data.
		//ts2.add(null);   // treeset can not store null values
		
		System.out.println(ts2);
		
	}

}
