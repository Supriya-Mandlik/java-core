package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Stream never modify the original list,we have to create new list to store modified list so that 
 * we use collect(Collectors.toList()) method */

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,0,1,2,4);
	List<Integer> filteredlist = list.stream().filter( x -> x%2 ==0 ).collect(Collectors.toList());
	/* list converted to stream-->stream filter-->input to filter is predicate-->then that filtered 
	stream in again converted to list by collect(Collectors.toList()) */
	System.out.println(filteredlist);
	
	List<Integer> mappedlist = filteredlist.stream().map( x -> x/2 ).collect(Collectors.toList());
	/* map takes Function as input*/
	System.out.println(mappedlist);
	
 List<Integer> distinctlist = list.stream().filter(x->x%2==0).map(x->x/2).distinct().collect(Collectors.toList());
    // distinct is used to avoid repeated elements. 	
     System.out.println(distinctlist);
	
	List<Integer> sortedlist = list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted().collect(Collectors.toList());
	// sorted is used to sort list
	System.out.println(sortedlist);
	
	List<Integer> descendingsortedlist = list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted( (a,b)->b-a ).collect(Collectors.toList());
	// sort in descending order by passsing comparator to sort() method
	System.out.println(descendingsortedlist);
	
	List<Integer> limitedlist =list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).limit(4).collect(Collectors.toList());
	// limit() is used to set limit from starting
	System.out.println(limitedlist);
	
	List<Integer> skipedlist = list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->b-a).limit(4).skip(1).peek(x->System.out.println(x)).collect(Collectors.toList());
	// skip() is used to skip element from starting.
	// peek() takes consumer. it is used to print stream
	System.out.println(skipedlist);
	
	
	}

}
