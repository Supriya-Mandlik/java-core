package EncapsulationVottingTest;

public class VottingEligibility {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age>0) {
			this.age = age;	
		} else {
           age = 0;
           System.out.println("You are Assigning incorrect value to Age");
		}
		
	}
	
	void CheckEligibilityOfVotting() {
		if (age>=18) {
			System.out.println("You are Eligible for Votting:"+age);
		} else {
            System.out.println("You are not Eligible for Votting:"+age);
		}
	}
}
