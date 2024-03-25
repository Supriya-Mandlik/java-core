package StringAssignment;

// Que. Write a Program to find the maximum occurring character in given string?

public class MaximumOccurringCharacter {
	
	public static void main(String[] args) {
		
		//String s = "abbccc";
		
		String s1 = "this is demo abc xyz";
		// here maximum repeated character is space
		s1 = s1.replaceAll("\\s", "");  // it removes all the spaces of the string
		System.out.println(s1);
		
		
		int[] arr = new int[127];
		
		for(int i=0;i<s1.length();i++) {
			
			arr[s1.charAt(i)] = arr[s1.charAt(i)] + 1 ;
				
		}
		
		int max = -1;
		char ch = ' ';
		
		for(int i=0;i<s1.length();i++) {
			
			if (max<arr[s1.charAt(i)]) {
				
				max = arr[s1.charAt(i)];
				ch = s1.charAt(i);
				
			}
			
		}
		
		System.out.println("Maximum repeated character is-"+ch);
		System.out.println("Character repeated"+" "+max+" "+"times");
	}

}
