package CollectionsSortingusingComparable;

// sorting using comparable interface

public class Employee implements Comparable<Employee>
{
	
	int empId;
	String name;
	int age;
	
	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		
		//return name.compareTo(o.name); 
		// here String class compareTo() method called
		// here String class already has written logic for strings
		
		
		if (empId==o.empId) {            
			return 0;
		} else if (empId > o.empId) {
			return 1;
		}else
		return -1;
		
		
	}
	
}
