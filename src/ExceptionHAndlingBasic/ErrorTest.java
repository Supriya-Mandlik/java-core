// Stack OverFlow Error
package ExceptionHAndlingBasic;


public class ErrorTest {
	
	void m1() {
		System.out.println("In m1 method");
		m2();
	}
	
	void m2() {
		System.out.println("In m2 method");
		//m1();
	}
	
	public static void main(String[] args) {
		
		ErrorTest et = new ErrorTest();
		et.m1();
		
	}

}
