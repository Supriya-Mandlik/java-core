package LambdaExpressionTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
	
	public static void print(String s) {   // static method
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
	
		List<String> students = Arrays.asList("Hridya","Anvika","Advik");
		
		//students.forEach(x -> System.out.println(x));  // lambda expresssion
		students.forEach(MethodReferenceTest::print);    // :: = method reference operator
		
		MethodReferenceTest obj = new MethodReferenceTest();
		students.forEach(obj::get);
			
	}
	
	public void get(String s) {    //non-static method
		System.out.println(s);
	}

}
