package LambdaExpressionTest;

interface DisplayInterface{
	
	void display();
	
}

public class MethodReferenceTest2 {
	
	public MethodReferenceTest2() {
		System.out.println("Hello from method reference class constructor");
	}
	
	
	public static void mrtest() {
		System.out.println("Hello from method reference class static method");
	}
	
	public void mrtest_nonstatic() {
		System.out.println("Hello from method reference class non static method");
	}
	
	public static void main(String[] args) {
		
		MethodReferenceTest2 obj = new MethodReferenceTest2();
		
		//1
		DisplayInterface di = new DisplayInterface() {
			
			@Override
			public void display() {
			System.out.println("Hello from Anonymous class");
				
			}
		};
		
		//2
		DisplayInterface di2= ()->System.out.println("Hello from lambda expression");
		
		//3 static MR
		DisplayInterface di3=MethodReferenceTest2::mrtest;
		
		//4 Instance MR
		DisplayInterface di4=obj::mrtest_nonstatic;
		
		// 5 Constructor MR
		DisplayInterface di5=MethodReferenceTest2::new;
		
		di.display();
		di2.display();
		di3.display();
		di4.display();
		di5.display();
		
		// method reference - 3 types
		//static MR
		// instance MR
		//constructor MR
		
	}

}
