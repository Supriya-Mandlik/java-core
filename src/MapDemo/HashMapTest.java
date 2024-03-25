package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(101, "deepak");  // values can be duplicate  
		hm.put(102, "amit");     // it does not follows insertion order
		hm.put(103, "rahul");
		hm.put(104, "kamal");
		hm.put(null, "deepak");     // key can store only one null value 
		hm.put(222, "aaa");        // it does not follows the sorting order
		hm.put(null, null);        // value can store multiple null values
		hm.put(111, "bbb");
		hm.put(102, null);       // map does not store duplicate keys
		
		System.out.println(hm);  // we get values in map form
		
		// 1] way to iterate HashMap one by one
		
		Set set = hm.entrySet();    // entrySet()-convert map values into set values  
		System.out.println(set);    // we get values in set form
		
		// to get values one by one we iterate it
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());  // gives output in Object form 
			Map.Entry entry = (Map.Entry) itr.next(); // Converting Object into Entry
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			// here we can get separate kay and values by getKey() and getValue() method
			
		}
		
		// 2] way to iterate HashMap one by one
		
			HashMap<Integer,String> hm2 = new HashMap<>();
			hm2.put(101, "deepak");
			hm2.put(102, "amit");
			hm2.put(103, "rahul");
			hm2.put(104, "kamal");
			
			System.out.println(hm2);
			
			for (Map.Entry me : hm2.entrySet()) {
				System.out.println(me.getKey()+" -> "+me.getValue());
			}
			
		// methods are similar to Map.
			
			hm2.putAll(hm);       // putAll()
			
		System.out.println(hm2);
		
		
		
	}

}
