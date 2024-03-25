package StringBasic;

public class StringBufferTest {

	public static void main(String[] args) {
	
	   // StringBuffer objects are mutable.	
		
		StringBuffer s = new StringBuffer("CodeMind");
		s.append(" Technology");
		System.out.println(s);
		
		// Constructors
		// 1] StringBuffer()
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		// 2] StringBuffer(String str)
		
		StringBuffer sb1 = new StringBuffer("deepak");
		System.out.println(sb1.capacity());
		
		// 3] StringBuffer(int capacity)
		
		StringBuffer sb2 = new StringBuffer(1000);
		System.out.println(sb2.capacity());
		
		// 4] StringBuffer(charSequence seq)
		
		StringBuffer sb3 = new StringBuffer('A');
		System.out.println(sb3.capacity());
		
		//-------------------------------------------------------//
		
		// Methods
		
		// 1] capacity() method 
		
		StringBuffer sb4 = new StringBuffer();
	    sb4.append("hello");
	    System.out.println(sb4);
		System.out.println(sb4.capacity());  //16
		sb4.append(" CodeMind Technology");
		System.out.println(sb4);
		System.out.println(sb4.capacity());   //34
		sb4.append(" java programming");
		System.out.println(sb4);
		System.out.println(sb4.capacity());
		
		// 2] append() method
		
		StringBuffer sb5 = new StringBuffer(" Batch 10");
		
		System.out.println(sb4.append(sb5));
		
		// 3] delete(int start , int end) method
		
		StringBuffer sb6 = new StringBuffer("CodeMind Technology");
		System.out.println(sb6.delete(2, 5));
		
		// 4] deleteCharAt(int index) method
		
		StringBuffer sb7 = new StringBuffer("CodeMind Technology");
		System.out.println(sb7.deleteCharAt(3));
		
		// 5] equals() method
		// in StringBuffer class equals() method checks the address of two objects
		
		StringBuffer sb8 = new StringBuffer("deepak java");
		StringBuffer sb9 = new StringBuffer("deepak java");
		System.out.println(sb8.equals(sb9));
		
		StringBuffer sb10 = sb8.append("hi");
		System.out.println(sb8.equals(sb10));
		
		// 6] insert() method
		
		StringBuffer sb11 = new StringBuffer("deepak java");
		System.out.println(sb11.insert(3, "zzz"));
		System.out.println(sb11.insert(3, 's'));
		
		// 7] replace(int start , int end , String str) method
		
		StringBuffer sb12 = new StringBuffer("deepak java");
		System.out.println(sb12.replace(3, 6, "m"));
		
		// 8] reverse() method
		
		StringBuffer sb13 = new StringBuffer("deepak java");
		System.out.println(sb13.reverse());
		
		// 9] toString() method
		// it converts StringBuffer into String
		
		StringBuffer sb14 = new StringBuffer("deepak java");  //StringBuffer
	    String sobj = sb14.toString();   //String
	    System.out.println(sobj);
	    
	    // 10] ensureCapacity(int minimumCapacity) method
	    
	    StringBuffer sb15 = new StringBuffer();
	    System.out.println(sb15.capacity());
	    sb15.ensureCapacity(100);  // its return type is void.
	    System.out.println(sb15.capacity());
	    
	    // 11] setCharAt(int index , char ch) method 
	    
	    StringBuffer sb16 = new StringBuffer("deepak");
	    sb16.setCharAt(4,'c');    // its return type is void
	    System.out.println(sb16);
	    
	    // 12] setLength(int newLength) method
	    
	    StringBuffer sb17 = new StringBuffer("deepak");
	    sb17.setLength(4);        // its return type is void
	    System.out.println(sb17);
	    
	    // 13] trimToSize() method
	    
	    StringBuffer sb18 = new StringBuffer();
	    sb18.ensureCapacity(100);    // its return type is void
	    sb18.append("hello");
	    sb18.trimToSize();       // its return type is void.so we have write this method like this.
	    System.out.println(sb18.capacity());
	    
		
	}

}
