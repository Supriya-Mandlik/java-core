// return outside of finally block
package ExceptionHAndlingBasic;


public class ReturnAndFinally {
	
	int m1() {
		int a = 0;
		try {
			a=5;
		    return a;
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		finally {
			a=10;
			System.out.println("In finally block");
		}
		System.out.println("In try");
			return a;
		}
		

	public static void main(String[] args) {
		ReturnAndFinally ret = new ReturnAndFinally();
		System.out.println(ret.m1());
	}

}
