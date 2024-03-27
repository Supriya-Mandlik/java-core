package LambdaExpressionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceTest {
	
	public static void main(String[] args) {
		
		//Function<String,Integer> obj = x -> x.length();
		//System.out.println(obj.apply("Vipul"));
		
		Function<String,String> obj2 = x -> x.substring(0, 3);
		Function<List<StudentAnother>,List<StudentAnother>> studentswithVipasprefix = s -> {
			List<StudentAnother> result = new ArrayList<>();
			for (StudentAnother str : s) {
				if (obj2.apply(str.getName()).equalsIgnoreCase("Vip")) {
					result.add(str);
				}
			}
			return result;
		};
		
		StudentAnother s1 = new StudentAnother(1,"Vipul");
		StudentAnother s2 = new StudentAnother(2,"Vishakha");
		StudentAnother s3 = new StudentAnother(3,"Vipulav");
		
		List<StudentAnother> li = new ArrayList<StudentAnother>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		List<StudentAnother> filteredStudents = studentswithVipasprefix.apply(li);
		System.out.println(filteredStudents);
		
		System.out.println("*--------------------*");
		
		Function<String,String> fun1 = x -> x.toUpperCase();
		Function<String,String> fun2 = x -> x.substring(0,3);
		
		//Function<String,String> result = fun1.andThen(fun2);   //andThen()
		//System.out.println(result.apply("Vipul"));
		
		System.out.println(fun1.andThen(fun2).apply("Vipul"));
		
		System.out.println("*-----------------------*");
		
		Function<Integer,Integer> function1 = x -> 2*x;
		Function<Integer,Integer> function2 = x -> x*x*x;
		
		System.out.println(function1.andThen(function2).apply(3));  //216
		System.out.println(function2.andThen(function1).apply(3));   //54
		
		System.out.println(function1.compose(function2).apply(3));   //54   //compose()
		
		System.out.println("*-----------------------*");
		
Function<String,String> identityfunction = Function.identity(); // identity() method // static method
		System.out.println(identityfunction.apply("Vipul"));
		
	}

}
