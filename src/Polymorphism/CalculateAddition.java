package Polymorphism;

//Method overloading

public class CalculateAddition {
	
	public static void main(String[] args) {
		CalculateAddition obj = new CalculateAddition();
		
		System.out.println("Addition is:"+obj.addition(10, 20));
		System.out.println("Addition is:"+obj.addition(10,20,30));
		System.out.println("Addition is:"+obj.addition(10, 20, 30, 40));
		System.out.println("Addition is:"+obj.addition(10, 20.20f));
		
	}
	
	int addition(int a,int b) {
		int res = a+b;
		return res;
	}
	
	int addition(int a,int b,int c) {
		int res = a+b+c;
		return res;
	}
	
	int addition(int a, int b, int c, int d) {
		int res = a+b+c+d;
		return res;
	}
	
    float addition(int a, float b) {
		float res = a+b;
		return res;
	}

}
