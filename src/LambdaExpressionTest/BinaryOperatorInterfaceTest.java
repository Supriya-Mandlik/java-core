package LambdaExpressionTest;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceTest {
	
	public static void main(String[] args) {
		
		BiFunction<String, String, String> bifunction = (str1,str2) -> str1 + str2 ;
		System.out.println(bifunction.apply("Hello", "World"));
		
		BinaryOperator<String> binaryoperator = (str1,str2) -> str1 + str2 ;
		System.out.println(binaryoperator.apply("Hello", "World"));
		
	}

}
