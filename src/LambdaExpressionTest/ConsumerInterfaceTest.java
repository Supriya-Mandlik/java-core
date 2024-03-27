package LambdaExpressionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceTest {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Vipul");
		
		Consumer<List<Integer>> listconsumer = li -> {
			for (Integer i : li) {
				System.out.println(i+100);
			}
		};
		
		//listconsumer.accept(Arrays.asList(1,2,3,4,5));
		
		Consumer<List<Integer>> listconsumer2 = li -> {
			for(Integer i : li) {
				System.out.println(i);
			}
		};
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		listconsumer2.accept(list);*/
		
		Consumer<List<Integer>> newlist = listconsumer.andThen(listconsumer2);  // andThen()
		
		newlist.accept(Arrays.asList(1,2,3,4,5));
	}

}
