package LambdaExpressionTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterfaceTest {
	
	public static void main(String[] args) {
		
		Function<String,Integer> function = str -> str.length();
		System.out.println(function.apply("Vipul"));
		
		BiFunction<String, String, Integer> bifunction = (x,y) -> x.length() + y.length();
		System.out.println(bifunction.apply("Hii", "Hello"));
		
	}

}
