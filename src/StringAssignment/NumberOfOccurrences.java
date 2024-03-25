package StringAssignment;

public class NumberOfOccurrences {
	
	public static void main(String[] args) {
		
		String str = "Java J2EE Java JSP J2EE";
		
		int[] arr = new int[127];
		
		for(int i=0;i<str.length();i++) {
			
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
			
		}
		
		for(int i=0 ; i<str.length();i++) {
			
System.out.println("Character::"+str.charAt(i)+" "+"No. of times it occurred::"+arr[str.charAt(i)]);
			
		}
		
	}

}
