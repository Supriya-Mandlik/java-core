package StringBasic;

public class StringBasic {
	
	public static void main(String[] args) {
		
  String name = "Ajay";
  
  String sName = "Akanksha";
  
  String pName = "Ajay";
  
  String qName = "Ajay Atul";
  
  name = "Ajay Kushawaha";
  
	String surName = "Patil";
	
	String fullName = sName +" "+surName ;  //String concatenation.
	System.out.println(fullName);
	
	System.out.println(fullName.length()); // length() method calculates the length of the string.
	
	char c = fullName.charAt(0); // it will give character at that index.String index starts from 0.
	System.out.println(c);
  
  String s = new String("Premchand"); //The objects created with new keyword are stored in heap area.
		
	String s1 = new String("Premchand");
	
	String s2 = s1.intern();
	
	StringBasic obj = new StringBasic();
	obj.m1();
  
	}
	
	void m1() {
		
		String m = "Supriya";
		
		String m1 = new String("Supriya"); // m1 points to the address at Heap.
		
		String m2 = m1.intern();  // m and m2 point to same address at SCP.
		
		for(int i=0;i<m.length();i++) {
			System.out.println(m.charAt(i));
		}
		
		String a = "s";
		a += "a";
		a+="u";
		a+="r";
		a+="a";
		a+="b";
		a+="h";
		System.out.println(a);
		
		String b1 = "My Name is Saurabh";
		String b2 = b1.substring(11,18);  //substring() method gives substring.
		System.out.println(b2);
		
		String c1 = "Tony";
		String c2 = "Tony";
		if(c1==c2) {
			System.out.println("Strings are Equal");
		}else {
			System.out.println("Strings are not Equal");
		}
		
		//String is sequence of characters/array of characters
		
		char[] c = {'s','u','p','r','i','y','a'};
		String s = new String(c);
		System.out.println(s);
		
		String d = "Advik";
		d=d.concat(" Gite");      //String concatenation.
		System.out.println(d);
		
		// split method.
		String str = "My Name is Supriya";
		String[] arr = str.split(" ");  //[My,Name,is,Supriya]  array
		
		for (String val : arr) {
			System.out.println(val);
		}
		
	}

}
