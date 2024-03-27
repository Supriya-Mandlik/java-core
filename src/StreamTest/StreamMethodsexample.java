package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsexample {
	
	public static void main(String[] args) {
		
List<String> WeekDays = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Monday");

 System.out.println("Count of Original List:"+ WeekDays.stream().count());
 
 System.out.println("Original List is :");
 
 WeekDays.stream().forEach(x -> System.out.print(x +" "));
 // forEach loop is used for iteration and it takes consumer as parameter.
 
 System.out.println();
 
 System.out.println("Distinct List is :");
 
 List<String> distinctList =
		 WeekDays.stream().distinct().peek(x -> System.out.print(x+" ")).collect(Collectors.toList());
	
 System.out.println();
 System.out.println("Sorted List is :");
 
List<String> sortedList =
distinctList.stream().sorted().peek(x -> System.out.print(x+" ")).collect(Collectors.toList());

System.out.println();
System.out.println("Filtered List Of Days Starts with T :");

List<String> filteredList =
 distinctList.stream().filter(x -> x.startsWith("T")).peek(x -> System.out.print(x+" ")).collect(Collectors.toList());

System.out.println();
System.out.println("Limited List having 4 days only :");

List<String> limitedList = distinctList.stream().limit(4).peek(x -> System.out.print(x + " ")).collect(Collectors.toList());

System.out.println();
System.out.println("List After Skipping first two days :");
List<String> SkippedList = distinctList.stream().skip(2).peek(x -> System.out.print(x+" ")).collect(Collectors.toList());

System.out.println();
System.out.println("Original List is :");
WeekDays.stream().forEach(x -> System.out.print(x+" "));
//WeekDays.stream().peek(x -> System.out.print(x+" ")).collect(Collectors.toList());

 
	}

}
