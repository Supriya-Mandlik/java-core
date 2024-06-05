package CollectionSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortComparator {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(8, "Tanu", 22));
		al.add(new Student(4, "Sumbul", 24));
		al.add(new Student(6, "Pratiksha", 25));
		
		System.out.println("Students Details Before Sorting : ");
		
		for (Student val : al) {
			System.out.println(val.rollno+" "+val.name+" "+val.age);
		}
		
		/*-------------------------------------------*/
		
		Collections.sort(al,new rollnoSorting());
		
      System.out.println("Students Details After rollnoSorting : ");
		
		for (Student val : al) {
			System.out.println(val.rollno+" "+val.name+" "+val.age);
		}
		
		/*-------------------------------------------*/
		
		Collections.sort(al,new nameSorting());
		
	      System.out.println("Students Details After nameSorting : ");
			
			for (Student val : al) {
				System.out.println(val.rollno+" "+val.name+" "+val.age);
			}
		
	}

}
