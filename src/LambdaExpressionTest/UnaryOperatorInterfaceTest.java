package LambdaExpressionTest;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceTest {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> function1 = x -> x*x ;
		System.out.println(function1.apply(2));
		
		UnaryOperator<Integer> unaryoperator = x -> x*x ;
		System.out.println(unaryoperator.apply(2));
		
		UnaryOperator<String> unaryoperator2 = str -> str.toUpperCase();
		System.out.println(unaryoperator2.apply("advik"));
		
	}

}
