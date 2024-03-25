package MapDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(101, "deepak");
		lhm.put(110, "rahul");
		lhm.put(104, null);
		lhm.put(105, "deepak");
		lhm.put(null, null);
		lhm.put(101, "raju");
		lhm.put(110, "aaa");
		
		System.out.println(lhm);
		
		/* LinkedHashMap is similar to HashMap but only difference is HashMap does not maintain
		 * insertion order whereas LinkedHashMap maintain insertion order. 
		 */
		
	}

}
