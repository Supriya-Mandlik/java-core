package LegacyClassesTest;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		// Properties
		
		v.add("deepak");
		v.add(1, "rahul");
		v.addElement("ravi"); // addElement() method
		v.add(100);
		v.add(10.25);
		v.add('c');
		v.add("rahul");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		
		// methods
		
		System.out.println(v.firstElement()); //firstElement() method
		
		System.out.println(v.lastElement());  // lastElement() method
		
		System.out.println(v.capacity()); // capacity() method
		
		//v.removeElement("deepak");  // removeElement() method
		//System.out.println(v);
		
		//v.removeElement(100);
		//System.out.println(v);
		
		//v.removeElementAt(3);  // removeElementAt() method
		//System.out.println(v);
		
		//v.removeAllElements();  // removeAllElements() method
		//System.out.println(v);
		
		v.setElementAt("aaaa", 8);  // setElementAt() method
		System.out.println(v);
		
		v.setSize(15);     // setSize() method
		System.out.println(v);
		
       // constructors
		
		Vector v1 = new Vector();   // 1] constructor ->Vector() -> initial capacity 10
		
		Vector v2 = new Vector(v1);  // 2] constructor -> Vector(Collection obj)
		
Vector v3 = new Vector(6);   // 3] constructor -> Vector(int initialCapacity) -> initial capacity 6

Vector v4 = new Vector(10, 2);  // 4] constructor -> Vector(int initialCapacity,int CapacityIncrement)
		
		
	}

}
