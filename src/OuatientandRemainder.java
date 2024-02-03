import java.util.Scanner;

public class OuatientandRemainder {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the divident-");
	int divident = sc.nextInt();
	System.out.println("Enter the divider-");
	int divider = sc.nextInt();
	int quotient = divident / divider ;
	System.out.println("The Quotient is-"+quotient);
	int remainder = divident % divider ;
	System.out.println("The Remainder is-"+remainder);
}
}	

