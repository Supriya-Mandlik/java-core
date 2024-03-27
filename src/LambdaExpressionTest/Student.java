package LambdaExpressionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Custom Sorting using Comparator and Lambda Expression

public class Student {
	
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(2,"Supriya");
		Student s2 = new Student(10, "Kiran");
		Student s3 = new Student(4,"Saurabh");
		Student s4 = new Student(55,"Advik");
		Student s5 = new Student(25,"Hridya");
		
		List<Student> ls = new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		
		System.out.println(ls);
		
		System.out.println("custom object sorting in ascending order");
		Collections.sort(ls,(a,b)->a.id-b.id); // custom object sorting in ascending order
		System.out.println(ls);
		
		System.out.println("custom object sorting in descending order");
		Collections.sort(ls,(a,b)->b.id-a.id);  // custom object sorting in descending order
		System.out.println(ls);
		
	}

}
