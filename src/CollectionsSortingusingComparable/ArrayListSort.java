package CollectionsSortingusingComparable;

//sorting using comparable interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort
{
	
	public static void main(String[] args)
	{
		ArrayListSort obj = new ArrayListSort();
		// obj.sortInteger();
		obj.sortEmployee();
		
	}
	
	void sortEmployee()
	{
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10, "Ramesh", 29));
		al.add(new Employee(20, "Umesh", 30));
		al.add(new Employee(5, "Gajanan", 31));
		al.add(new Employee(3, "Chandan", 34));
		
		System.out.println("Employee Before Sorting : ");
		
		for (Employee employee : al)
		{
			System.out.println(employee.empId+" "+employee.name+" "+employee.age);
		}
		
		Collections.sort(al);
		
       System.out.println("Employee After Sorting : ");
		
		for (Employee employee : al)
		{
			System.out.println(employee.empId+" "+employee.name+" "+employee.age);
		}
		
	}
	
	void sortInteger()
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(19);
		al.add(17);
		al.add(20);
		al.add(80);
		
       System.out.println("Values Before Sorting : ");
		
		for (Integer val : al) {
			System.out.println(val);
		}
		
		Collections.sort(al);
		
		System.out.println("Values After Sorting : ");
		
		for (Integer val : al) {
			System.out.println(val);
		}
			
	}

}
