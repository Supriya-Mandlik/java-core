package JavaCollectionFramework;
import java.util.ArrayList;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Supriya");
		al.add("Saurabh");
		al.add("Kiran");
		al.add("Advik");
		al.add("Anvika");
		
		System.out.println("ArrayList Iteration Using For Each Loop::");
		
		for (String val : al) {     // for each loop of ArrayList<String>
			System.out.println(val);  // we can not use get() method in for each loop
		}
		
		System.out.println("*---------------------------------------*");
		
		System.out.println("ArrayList Iteration Using While Loop::");
		
		int i=0;
		while (i<al.size()) {
			
			System.out.println(al.get(i));
			i++;
			
		}
		
		System.out.println("*---------------------------------------*");
		
		ArrayList<Integer> ali = new ArrayList<Integer>();
		
		ali.add(1);
		ali.add(2);
		ali.add(3);
		ali.add(4);
		ali.add(5);
		
		/*for(int j=0;j<ali.size();j++) {
			System.out.println(ali.get(j));
		}*/
		
		/*for (Integer val : ali) {    // for each loop of ArrayList<Integer>
			System.out.println(val);
		}*/
		
		/*int k=0;
		  while(k<ali.size()) {
			System.out.println(ali.get(k));
			k++;
		}*/
		
		System.out.println("ArrayList Iteration Using do-while Loop::");
		
		int k=0;
		do {
			System.out.println(ali.get(k));
			k++;
		} while (k<ali.size());
		
		ArrayList al2 = new ArrayList();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
        al2.add(40);
        al2.add(50);
        
        for (Object ob : al2) {    // for each loop of ArrayList
        	
			System.out.println(ob);  // we are getting integer value in object form
			
			int ob2 = (int)ob;  // typecasting //here converting object into primitive integer value
			
			System.out.println(ob2);  // primitive int value
			
		}
		
	}

}
