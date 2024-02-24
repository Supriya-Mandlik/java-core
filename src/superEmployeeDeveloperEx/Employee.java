package superEmployeeDeveloperEx;

public class Employee {
	
	int empId=1234;
	String name= "Supriya";
	String designation="Employee";
	String address = "Akole";
	
	void m1() {
	System.out.println("Inside Employee m1 method");	
	}

	public Employee(int a){
		super();
		System.out.println("Inside Employee Parameterized Constructor");
	}

}
