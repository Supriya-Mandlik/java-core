package ArrayListTest;

import java.util.ArrayList;

public class ArrayListConstructors {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();  // 1] Empty Constructor // default initial capacity-10
		
	ArrayList al2 = new ArrayList(6); // 2] here user can set initial capacity.initial capacity-6
	
	   ArrayList al3 = new ArrayList();
	   al3.add(10);
	   al3.add(20);
	   al3.add(30);
		
	  ArrayList al4 = new ArrayList(al3);  // 3] here we pass al3 collection object as a parameter
		
		System.out.println(al4);  // all elements of al3 are stored in al4 also.
		
	}

}
