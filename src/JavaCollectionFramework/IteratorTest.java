package JavaCollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Spriya");
		al.add("Samruddhi");
		al.add("Kajal");
		al.add("Shivani");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			
			String val = itr.next();
			
			System.out.println(val);
			
		}
		
	}

}
