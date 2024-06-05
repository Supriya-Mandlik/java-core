package CollectionsSortingusingComparable;

import java.util.TreeSet;

//sorting using comparable interface

public class TreeSetSort {
	
	public static void main(String[] args) {
		
		TreeSetSort obj = new TreeSetSort();
		//obj.sortInt();
		obj.sortEmpl();
		
	}
	
	void sortEmpl() {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(4, "Umesh", 30));
		ts.add(new Employee(6, "Ramesh", 31));
		
		for (Employee employee : ts)
		{
			System.out.println(employee.empId+" "+employee.name+" "+employee.age);
		}
		
		
	}
	
	void sortInt() {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(1);
		ts.add(3);
		
		for (Integer val : ts) {
			System.out.println(val);
		}
		
	}

}
