import java.util.Scanner;

public class switchstatement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character:");
		char ch = sc.next().charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("Entered Character is vowel and it it A");
			break;
			
		case 'E':
			System.out.println("Entered Character is vowel and it it E");
			break;
			
		case 'I':
			System.out.println("Entered Character is vowel and it it I");
			break;
			
		case 'O':
			System.out.println("Entered Character is vowel and it it O");
			break;
			
		case 'U':
			System.out.println("Entered Character is vowel and it it U");
			break;	

		default:
			System.out.println("Entered character is not Vowel");
			break;
		}
		
	}	
	}
	
	
	
	
	
	
	
	
