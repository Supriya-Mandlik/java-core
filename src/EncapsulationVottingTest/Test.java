package EncapsulationVottingTest;

public class Test {
	
	public static void main(String[] args) {
		
		VottingEligibility obj = new VottingEligibility();
		//obj.age=-18;         we can not access variable directly
		obj.setAge(-18);
		obj.CheckEligibilityOfVotting();
		
	}

}
