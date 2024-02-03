import java.util.Scanner;

public class DecesionStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age-");
		int a = sc.nextInt();
		if ((a>=18)&&(a<=30)) {
			System.out.println("You are eligible for votting");
			System.out.println("You are young");
		}else if ((a>30)) {
			System.out.println("You are eligible for votting");
			System.out.println("You are old");
		}
		else {
           System.out.println("You are not eligible for votting");
		}
	}
}
	
	
	
