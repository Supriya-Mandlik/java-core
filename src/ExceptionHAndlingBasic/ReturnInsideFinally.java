// return Inside finally block
package ExceptionHAndlingBasic;


public class ReturnInsideFinally {

	int m1() {
		
		int a=0;
		
		try {
			a=5;
			return a;
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		finally {
			a=10;
			System.out.println("In finally block");
			return a;
		}
	}
	
	public static void main(String[] args) {
		ReturnInsideFinally rif = new ReturnInsideFinally();
		System.out.println(rif.m1());
	}
	
}
