package LambdaExpressionTest;

public class RunnableClassTest {
	
	public static void main(String[] args) {
		
		Runnable obj = () -> {       // code for run() method of Predefined Runnable interface
			for(int i=1;i<=10;i++) {
				System.out.println("Hello"+" "+i);
			}
		};
		
		Thread t = new Thread(obj);
		t.run();  
	  /* run method is abstract method which is present in Predefined Functional Interface Runnable.
	   This interface is used for creating threads.
	   */
				
		
	}

}
