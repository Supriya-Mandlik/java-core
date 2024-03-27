package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example {
	
	public static void main(String[] args) {
		
		List<Integer> collect = Stream.iterate(0, n -> n+1)
				.limit(26)
				.filter(x->x%2==0)
				.map(x->x/2)
				.peek( x -> System.out.println(x))
				.collect(Collectors.toList());
		System.out.println(collect);
		
		Integer max = Stream.iterate(0, n -> n+1)
				.limit(26)
				.filter(x->x%2==0)
				.map(x->x/2)
				.max( (a,b) -> a - b ) 
                .get();
		System.out.println(max);
//max()-it takes comparator.it sort according to ascending order and gives last value i.e maximum value.
		
		Integer min = Stream.iterate(0, n -> n+1)
				.limit(26)
				.filter(x->x%2==0)
				.map(x->x/2)
				.min( (a,b) -> a - b ) // min()-it uses comparator
                .get();
		System.out.println(min);
		
		Long  count = Stream.iterate(0, n -> n+1)
				.limit(26)
				.filter(x->x%2==0)
				.map(x->x/2)
				.count();   // count()- gives count of elements
		System.out.println(count);
	
		
	}

}
