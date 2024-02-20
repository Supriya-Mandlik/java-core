package abstractclassEmployee;

public class Test {
	
	
	public static void main(String[] args) {		
		Employee obj1 = new Contractor("contractor", 10, 10);  
		System.out.println(obj1.calculateSalary());
		
		
		Employee obj2 = new FullTimeEmployee("full time employee",8);
		System.out.println(obj2.calculateSalary());
		
	}

}
