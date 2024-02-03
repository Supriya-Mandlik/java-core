

import java.util.Scanner;

public class LowercaseorUppercase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character:");
		char ch = sc.next().charAt(0);
		
		if ((ch>='A')&&(ch<='Z')) {
			
			System.out.println("Entered character is Uppercase-"+ch);
			
		}else if ((ch>='a')&&(ch<='z')) {
			System.out.println("Entered character is Lowercase-"+ch);
		} 
		else {
            System.out.println("Entered character is not an alphabet-"+ch);
		}
		
	}
}
	
	

