package StringBasic;

public class StringComparision {
	
	public static void main(String[] args) {
		
		// 1] Primitive Data Type   // In Primitive data type "==" checks values 
		
		int a = 10;
		int b = 20;
		
		if (a == b) {      
			System.out.println("a and b both are Same");
		} else {
           System.out.println("a and b both are Not Same");
		}
		
		char c1 = 'A';
		char c2 = 'A';
		if (c1 == c2) {
			System.out.println("Same");
		} else {
            System.out.println("Not Same");
		}
		
		// 2] Object Comparison
		//Objects are created on heap area
		
		StringComparision Obj1 = new StringComparision();
		StringComparision Obj2 = new StringComparision();
		
		// 2.1] Comparison Operator   // In Object class "==" checks the Addresses of two objects
		
		if (Obj1 == Obj2) {        
			System.out.println("Both Objects are Same");
		} else {
            System.out.println("Both objects are Not Same");
		}
		
		// 2.2] equals method     // In Object class equals method checks the Addresses of two objects
		//the output of equal method is boolean.
		
		if (Obj1.equals(Obj2)) {
			System.out.println("Both Objects are Same Using equals method");
		} else {
			System.out.println("Both Objects are Not Same Using equals method");
		}
		
		// 3] String Literals Comparison
		//String objects which are created with String Literals method are created on String constant pool(SCP)/String literal pool(SLP)
		
		String s1 = "Codemind";
		String s2 = "codemind";
		
		// 3.1] Comparison Operator     // In String class "==" check the addresses of two Strings
		
		if (s1 == s2) {           
			System.out.println("Both String literals are Same");
		} else {
           System.out.println("Both String literals are Not Same");
		}
		
		// 3.2] equals method     // In String class equals method checks the values of two Strings
		
		if (s1.equals(s2)) {
			System.out.println("Both String literals are Same using equals method ");
		} else {
            System.out.println("Both String literals are Not Same using equals method");
		}
		
		// 3.3] equalIgnoreCase method  
	 // In String class equalIgnoreCase method checks the values of two Strings and ignores the case.
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both String literals are Same using equalIgnoreCase method");
		} else {
			System.out.println("Both String literals are Not Same using equalIgnoreCase method");
		}
		
		// 4] String Object Comparison
		//String objects which are created with new keywords are created on heap area.
		
		String s3 = new String("Codemind");
		String s4 = new String("Codemind");
		
		// 4.1] Comparison Operator    // In String class "==" check the addresses of two Strings
		
		if (s3 == s4) {          
			System.out.println("Both String Objects are Same");
		} else {
            System.out.println("Both String Objects are Not Same");
		}
		
		// 4.2] equals method     // In String class equals method check the values of two Strings
		
		if (s3.equals(s4)) {
			System.out.println("Both String Objects are Same using equals method");
		} else {
            System.out.println("Both String Objects are Not Same using equals method");
		}
		
	}

}
