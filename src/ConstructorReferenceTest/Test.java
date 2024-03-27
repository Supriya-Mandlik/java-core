package ConstructorReferenceTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Advik","Anvika","Hridya");
	//List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
	List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());	
	
	//stream() convert list into stream
	// collect(Collectors.toList()) convert stream into list.
	}

}
