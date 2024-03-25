package JavaCollectionFramework;
import java.util.ArrayList;

public class Basic {
	
	public static void main(String[] args) {
		
		// Array
		
		// Arrays are used to store primitive and Non-primitive values
		System.out.println("Using Array");
		String[] arr = new String[5];
		
		arr[0]="Supriya";
		arr[1]="Saurabh";
		arr[2]="Advik";
		arr[3]="Anvika";
		arr[4]="Kiran";
		
		System.out.println("Array value-"+arr);
		// here it will not print values because Array does not have toString method .
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	   // Collection
		System.out.println("Using ArrayList");
		//ArrayList is used to store Objects
		ArrayList al = new ArrayList();
		
		al.add("Supriya");  // to add we use add() method
		al.add("Saurabh");
		al.add("Kiran");
		al.add("Advik");
		al.add("Anvika");
		al.add(1);  //it is internally converted into interger object   // java 1.8 (After java 1.5)
	//al.add(new Integer(1));  // integer object       // java 1.4(Before java 1.5)
		al.add(10.25F);
		//al.add(new Float(10.25F));
		al.add(null);
		al.add(true);
		//al.add(new Boolean(true));
		al.add('A');
		al.add('+');
		
		System.out.println("ArrayList Value-"+al);  // here al = al.toString()
		//it will print values beacuse ArrayList has toString() method in it.
		
		System.out.println(al.get(0));
		
		for(int i=0;i<al.size();i++) {       // size() method
			//String s = (String)al.get(i);  // typecast (converting object into String)
			//System.out.println(s);
			System.out.println(al.get(i));  // to get values we use get() method
		}
		
	}

}
