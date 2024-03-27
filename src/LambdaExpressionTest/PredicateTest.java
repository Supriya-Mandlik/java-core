package LambdaExpressionTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> pr = x -> x>100000;
		System.out.println(pr.test(100000000));
		
	   Predicate<Integer> iseven = x -> x % 2 == 0 ;  // here x is a test method parameter
	   List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
	   for (Integer i : numbers) {
		if (iseven.test(i)) {
			System.out.println(i);
		}
	   }
	   
		Predicate<String> StartsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
		System.out.println(StartsWithLetterV.test("Vipul"));
		
		Predicate<String> EndsWithLetterL = x -> x.toLowerCase().charAt(x.length()-1) == 'l';
		
		Predicate<String> and = StartsWithLetterV.and(EndsWithLetterL);  // and in predicate
		System.out.println(and.test("vipul"));
	    
		Predicate<String> or = StartsWithLetterV.or(EndsWithLetterL);  // or in predicate
		System.out.println(or.test("Vivek"));
		
		System.out.println(StartsWithLetterV.negate().test("Vipul"));  // negate in predicates
		
		Student s1 = new Student(1,"Supriya");
		Student s2 = new Student(2, "Kiran");
		Student s3 = new Student(3,"Saurabh");
		Student s4 = new Student(4,"Advik");
		Student s5 = new Student(5,"Hridya");
		
		Predicate<Student> studentpredicate = x -> x.id > 1 ;
		System.out.println(studentpredicate.test(s4));
		
		Predicate<Object> predicate = Predicate.isEqual("Vipul");   
		System.out.println(predicate.test("Vipul"));
		// isEqual() method is static method. we can access it by interface name only
		
	}
	
}
