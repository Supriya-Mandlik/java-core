package StringAssignment;

// Que. Write a program to check if a given String is Palindrome or not?
// palindrome examples are  => 121 , 1221 , mam , madam(if reverse it remains same)

public class PalindromeOrNot {
	
	public static void main(String[] args) {
		
	String s = "madam";
	
	String rev = "";
	
	for(int i=s.length()-1 ; i>=0 ;i--) {
		
		rev = rev+s.charAt(i);
		
	}
		
	if (s.equals(rev)) {   // if true
		
		System.out.println("Palindrome String");
		
	} else {       // if false
		
		System.out.println("Not a Palindrome String");

	}
	
	}

}
