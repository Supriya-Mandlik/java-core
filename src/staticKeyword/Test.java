package staticKeyword;

public class Test {
	
	static int a;
	static int b;
	static int addition;
	static int substraction;
	int multiplication;
	int division;
	
	static{
		a=100;
		b=10;
		addition=a+b;
		System.out.println("First value-"+a);
		System.out.println("Second value-"+b);
		System.out.println("Addition-"+addition);
	}
	
	static {
		substraction = a-b;
		System.out.println("Substraction-"+substraction);
	}
	
	{
		multiplication=a*b;
		System.out.println("Multiplication-"+multiplication);
	}
	
	{
		division=a/b;
		System.out.println("Division-"+division);
	}
	
	public static void main(String[] args) {
		
		System.out.println("***Main Method***");
		
		Test obj = new Test();  //constructor call	
		
	}
}
