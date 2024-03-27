package ClassExamplesJava8Features;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class PredefinedSAMInterfacesTest {
	
	public static void main(String[] args) {
		
	Runnable RunnableObj = () -> System.out.println("Inside run() method of Runnable Interface");
	RunnableObj.run();  // run() method is void method.

	//Callable<String> CallableObj = () -> "Welcome";
	
	//CallableObj.call();
	
	//Comparator<Integer> ComparatorObj = (x,y) -> x - y ;
	//System.out.println(ComparatorObj.compare(20, 10));
	
		
	}

}
