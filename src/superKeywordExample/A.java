package superKeywordExample;

public class A {
	
	public A() {
		this(10);
		System.out.println("Inside class A default constructor.");
	}
	
	public A(int a) {
		System.out.println("Inside class A Parameterized constructor. ");
	}
	
	void m1() {
		System.out.println("inside class A m1 method.");
		B b = new B(10);
	}

}
