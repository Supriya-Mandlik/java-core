package throwthrows;

import java.util.Scanner;

public class throwthrows {
	
	// throws
	static void Eligibility() throws StudentEligibilityTest {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		int weight = sc.nextInt();
		
		if (age<12 && weight<40) {
			
			throw new StudentEligibilityTest("Student is not Eligible"); // custom checked exception
			
		} else {
            System.out.println("You are eligible");
		}
		
		
	}
	
	// throw
	static void StudentEligibility() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		int weight = sc.nextInt();
		
		try {
		if (age<12 && weight<40) {
			
		//throw new ArithmeticException("Student is not eligible."); // already defined exception
		//throw new StudentEligibilityTest("Student is not Eligible"); // custom checked exception
		throw new StudentEligibilityVerify("Student is not Eligible");  // custom unchecked Exception
		
		} else {
            System.out.println(" Student is eligible");
		}
		}catch(StudentEligibilityVerify sev) {
			sev.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome!");
		
		StudentEligibility();
		
		try {
		Eligibility();
		}
		catch(StudentEligibilityTest set) {
			set.printStackTrace();
		}
		
		System.out.println("End Successfully!");
		
	}

}
