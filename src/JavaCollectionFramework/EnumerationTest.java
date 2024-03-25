package JavaCollectionFramework;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	
	public static void main(String[] args) {
		
		Vector<Integer> ve = new Vector<Integer>();
		
		ve.add(10);
		ve.add(20);
		ve.add(30);
		ve.add(40);
		ve.add(50);
		
		System.out.println(ve);
		
		System.out.println("*---------------------------*");
		
		Enumeration<Integer> enm = ve.elements();
	
		/*while(enm.hasMoreElements()) {
			
			System.out.println(enm.nextElement()); 
			
		}*/
		
		while (enm.hasMoreElements()) {
			Integer integer = (Integer) enm.nextElement();
			System.out.println(integer);
		}
		
		System.out.println("*---------------------------*");
		
		Vector v = new Vector();
		v.add(10);
		v.add("deepak");
		v.add(10.25);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}

}
