package OverrideTestEmployee;

public class Test {
	
	public static void main(String[] args) {
		
		Employee obj = new SWDeveloper();
		//we can not change the reference class.
		//we can only change the child class.
		
		obj.saveEmployee();
		
	}

}
