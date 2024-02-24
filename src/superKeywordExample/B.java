package superKeywordExample;

public class B extends A{
	
	public static void main(String[] args) {
		B b = new B();
		b.m2();	
	}
	public B() {
		super();
		System.out.println("Inside class B default constructor.");
	}
	public B(int a) {
		this();
		System.out.println("Inside class B parametarized constructor.");
	}
	void m2() {
		System.out.println("Inside class B m2 method");
        m1();
	}
	
}
