package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(101);
		al.add(102);
		al.add(103);
		System.out.println(al);
		
		Map map = new HashMap();
		
		map.put(104, "deepak");  // values can be duplicate   
		map.put(101, "deepak");   //put(Object key,Object value) 
		map.put(102, "amit");   // it does not follows insertion order
		map.put(103, "kamal");
		map.put(102, "ravi");  // map does not store duplicate keys
	    map.put(null, "aaa");      // key can store only one null value 
	    map.put(null, null); 
	    map.put(105, null);       // value can store multiple null values
		
		
		//map.clear();          // clear()
		System.out.println(map.containsKey(103));   // containsKey(Object key)
		System.out.println(map.containsValue("Advik"));  // containsValue(Object value)
		System.out.println(map.get(102));             // get(Object key)-returns value
		System.out.println(map.isEmpty());         // isEmpty()
		//map.remove(103);                       // remove()
		//map.replace(102, "ravi");            // replace()
		System.out.println(map.size());      // size()
		System.out.println(map);
		
		
		
	}

}
