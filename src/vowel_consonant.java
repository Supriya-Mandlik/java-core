import java.util.Scanner;

public class vowel_consonant{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter any Character:");
		 char ch = sc.next().charAt(0);
		 
		  if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			  
			  switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':	
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':	
			System.out.println("Entered Character is Vowel:"+ch);
			break;

			default:
				System.out.println("Entered Character is Consonant:"+ch);
				break;
			}
			
		} else {
                System.out.println("Enter Character is not Alphabet:"+ch);
		}
		
	}	
	
}
	
	
		