package StringBasic;

public class StringMethods {
	
	public static void main(String[] args) {
		
// Strings Created by String Class are immutable 
//means we can not modify String if we modify it will create new String.
		
		//1] Concatenation Method
		
		// 1.1] By + (String Concatenation) Operator
		
		String s1 = 10+50+"CodeMind"+20+60;
		System.out.println(s1); 
		String s = "supriya";
		System.out.println(s+20/10);
		System.out.println(s+10*10);
		//System.out.println(s+10-5);  //error
		
		// 1.2] By concat() method
		
		String s2 = new String("CodeMind");
		s2.concat(" Technology");
		System.out.println(s2);
		
		String s3 = new String("CodeMind");
		s3 = s3.concat(" Technology");
		System.out.println(s3);
		
		// 2] substring method
		
		// 1]
		String s4= "CodeMind";
		String sb1 = s4.substring(4);  // only give Start index
		System.out.println(sb1);
		
		// 2]
		String s5 = "CodeMind";
		String sb2 = s5.substring(0,1);  // give starting index and ending index.
		System.out.println(sb2);
		
		// 3] toUpperCase() method
		// it convert String into Uppercase
		
		String s6 = "codemind";
		String su = s6.toUpperCase();
		System.out.println(su);
		
		// 4] toLowerCase() method
		// it convert String into lowercase
		
		String s7 = "TECHNOLOGY";
		String sl = s7.toLowerCase();
		System.out.println(sl);
		
		// 5] trim() method
		// it removes(trim) the space.
		// output of trim() method is String.
		
		String s8 = "   CodeMind   ";
		String st = s8.trim();
		System.out.println(st);
		
		if (s8.trim().length() == 0) {    // we can call two methods at a time also.
			//if(s8.trim().isEmpty())		
			System.out.println("String is Empty");
		} else {
           System.out.println(s8.trim());
		}
// because trim() method returns string and we can apply length() and isEmpty() method on String.		
		
		// 6] charAt(int index) method
		// it prints the character at particular index.
		
		String s9 = "CodeMind Technology";
		char c = s9.charAt(4);
		System.out.println(c);
		
		// 7] length() method
		// it calculates the length of the String.
		
		String s10 = "CodeMind Technology";
		int slen = s10.length();
		System.out.println(slen);
		
		// 8] startsWith(String prefix)
		
		String s11 = "CodeMind";
		boolean sw = s11.startsWith("C");
		System.out.println(sw);
		
		// 9] endsWith(String sufix)
		
		String s12 = "CodeMind";
		boolean ew = s12.endsWith("e");
		System.out.println(ew);
		System.out.println(s12.endsWith("d"));
		
		// 10] split method.
	    // split method split(convert) String into array.
		
		String str = "My Name is Supriya";
		String[] arr = str.split(" ");  //[My,Name,is,Supriya]  array
		
		for (String val : arr) {
			System.out.println(val);
		}
		
		// 11] isEmpty() method
			
			String s13 = "";
			System.out.println(s13.isEmpty()); // output of isEmpty() method is boolean value
			
			if (s13.isEmpty() == true) {
				System.out.println("String is empty");
			} else {
	           System.out.println(s13);
			}
			
			// to find String is empty or not using length() method
			String em = "";
			int emlen = em.length(); // output of length method is integer value
			if (emlen == 0) {
				System.out.println("String is empty");
			} else {
	           System.out.println(em);
			}
			
			// to find String is empty or not using equal() method
				System.out.println(em.equals(""));
		
		// 12] equal() method
				
		// 13] equalIgnoreCase() method
				
		// 14] compareTo() method
				
		String s14 = "ABC";
		String s15 = "abc";
		System.out.println(s14.compareTo(s15));
		
		// 15] compareToIgnoreCase() method
		
		String s16 = "aB";
		String s17 = "Ab";
		System.out.println(s16.compareToIgnoreCase(s17));
		
		// we can calculate length of the string through compareTo() method
		// to calculate length of the string through compareTo() method 2nd string should be empty.	
		String s18 = "Supriya";
		String s19 = "";  
		System.out.println(s18.compareTo(s19));
		
		// 16] join() method
		
		String s20 = "Supriya";
		String s21 = "mandlik";
		System.out.println(String.join(";",s20,s21,s20));
		
		// 17] subSequence() method
		
		String s22 = "This is demo";
		System.out.println(s22.subSequence(3, 9));
		
		// 18] replace() method
		
		String s23 = "this is demo";
		System.out.println(s23.replace("is","was"));
		
		// 19] replaceFirst() method
		
		System.out.println(s23.replaceFirst("is", "was"));
		System.out.println(s23.replaceFirst("is(.)", "was"));
		
		// 20] replaceAll() method
		
		System.out.println(s23.replaceAll("is", "was"));
		System.out.println(s23.replaceAll("is(.)", "was"));
		System.out.println(s23.replaceAll("is(.*)", "was"));
		
		// 21] indexOf() method
		
		String s24 = "deepak";
		System.out.println(s24.indexOf('e'));
		System.out.println(s24.indexOf("ep"));
		System.out.println(s24.indexOf('c'));
		
		// 22] lastIndexOf() method
		
		System.out.println(s24.lastIndexOf('e'));
		
		// 23] contains() method
		
		String s25 = "deepak";
		System.out.println(s25.contains("ep"));
		
		// 24] valueOf() method
		
		int a = 10;
		String s26 = String.valueOf(a);
		System.out.println(s26);
		
		int b = 20;
		String s27 = String.valueOf(b);
		System.out.println(s27);
		
		System.out.println(a+b);    // it adds two integer values
		System.out.println(s26+s27);  // it concatenates two strings
		
		// 25] toCharArray() method
		
		String name = "supriya";
		char[] cr = name.toCharArray();
		System.out.println(cr);
		for (char val : cr) {
			System.out.println(val);
		}
		
	}

}
