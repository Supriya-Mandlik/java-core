package LambdaExpressionTest;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerInterfaceTest {
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = x -> System.out.println(x);
		consumer.accept(100);
		
		BiConsumer<Integer, Integer> biconsumer = (x,y) -> System.out.println(x+y);
		biconsumer.accept(1, 2);
		
	}

}
