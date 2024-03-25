package MapDemo;

import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		
		// TreeMap gives output in sorting order with respect to keys.
		
		TreeMap tm = new TreeMap();
		tm.put(106, "deepak");
		tm.put(103, "amit");
		tm.put(107, "kamal");
		tm.put(102, "deepesh");
		tm.put(108, "rahul");
		tm.put(101, "ravi");
		
		System.out.println(tm);
		
		System.out.println(tm.ceilingEntry(103));   // ceilingEntry(kay)
		System.out.println(tm.ceilingEntry(104));    // ceilingEntry(key)
		System.out.println(tm.ceilingKey(103));     // ceilingKey(key)
		System.out.println(tm.ceilingKey(104));     // ceilingKey(key)
		
		//tm.clear();     // clear()
		//System.out.println(tm);
		
		System.out.println(tm.containsKey(104));   // containsKey(key)
		System.out.println(tm.containsValue("ravi")); // containsValue(value)
		
		System.out.println(tm.firstEntry());  // firstEntry()
		System.out.println(tm.firstKey());    // firstKey()
		
		System.out.println(tm.floorEntry(108));   // floorEntry(key)
		System.out.println(tm.floorEntry(105));    // floorEntry(key)
		
		System.out.println(tm.get(103));   // get()
		System.out.println(tm.get(104));    // get()
		
		System.out.println(tm.headMap(102));  // headMap()
		System.out.println(tm.headMap(108));   // headMap()
		
		System.out.println(tm.higherEntry(103));  // higherEntry()
		System.out.println(tm.higherEntry(108));  // higherEntry()
		
		System.out.println(tm.keySet());  // keySet()
		System.out.println(tm.descendingKeySet());  // descendingKeySet()
		
		System.out.println(tm.lastEntry());   // lastEntry()
		
		tm.pollFirstEntry();    // pollFirstEntry()
		System.out.println(tm);
		
		tm.pollLastEntry();        // pollLastEntry()
		System.out.println(tm);
		
		tm.remove(102);              // remove()
		System.out.println(tm);
		
		tm.replace(103, "aaa");      // replace()
		System.out.println(tm);
		
		System.out.println(tm.size());  // size()
		
		System.out.println(tm.subMap(103, 107));   // subMap()
		
	}

}
