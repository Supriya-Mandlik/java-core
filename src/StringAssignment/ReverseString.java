package StringAssignment;

// Que. write a program to reverse a Given String?

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Myjava";
		
		System.out.println("Given String is-");
		System.out.println(str);
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println("Reverse String is-");
		System.out.println(rev);
		
	}

}
