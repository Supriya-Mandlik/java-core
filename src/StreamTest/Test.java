package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// how to generate stream

public class Test {
	
	public static void main(String[] args) {
		
		// imperative approach
		int[] arr1 = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i]%2 == 0) {
				sum = sum + arr1[i];
			}
		}
		
		// stream
		int[] arr = {1,2,3,4,5};
		//int sum2 = Arrays.stream(arr).filter(n -> n%2 == 0);
		
		// converting list into stream
		
		List<String> list = Arrays.asList("apple","banana","cherry");
		Stream<String> mystream = list.stream();
		
		// converting array into stream
		
		String[] array = {"apple","banana","cherry"};
		Stream<String> stream = Arrays.stream(array);
		
		// we can create stream also
		
		Stream<Integer> integerstream = Stream.of(1,2,3);  // [1]  way 
			
	Stream<Integer> integerstream2 = Stream.iterate(0, n -> n+1).limit(10);   // [2] way
		// iterate take unaryoperator i.e function
		
	Stream<String> stream2 = Stream.generate( () -> "Hello").limit(5);  // [3] way
	// generate take supplier 
	
	Stream<Integer> stream3 = Stream.generate( () -> (int)Math.random()*100).limit(5); 
	// random number stream
	
	}

}
