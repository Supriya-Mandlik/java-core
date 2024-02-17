package OverrideTestBank;

public class User {
	
	public static void main(String[] args) {
		
		Bank obj = new SBI();
		System.out.println(obj.calcInterst(2000,2));
		
	}

}
