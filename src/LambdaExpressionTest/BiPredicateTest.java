package LambdaExpressionTest;

import java.util.function.*;

public class BiPredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = x -> x % 2 == 0 ;
		System.out.println(predicate.test(2));
		
		BiPredicate<Integer , Integer> bipredicate = (x, y) -> x%2==0 && y%2==0 ;
		System.out.println(bipredicate.test(2,4));
		
		BiPredicate<String , Integer> bipredicate2 = (str , x) -> str.length() == x ;
		System.out.println(bipredicate2.test("Vipul",5));
		
	}

}
