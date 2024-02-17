package OverrideTestBank;

public class SBI extends Bank {
	
	public double calcInterst(double amount , int duration) {
		
		return amount*duration*8/100;
		
	}

}
