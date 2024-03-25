package ExceptionHAndlingBasic;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		try
		{
		       t.divide();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("End");
		
	}

	void divide() {
		
		int a=100 , b=0 ,c;
		c=a/b;
		System.out.println(c);
		
	}
	
}
