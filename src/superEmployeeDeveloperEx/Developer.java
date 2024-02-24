package superEmployeeDeveloperEx;

public class Developer extends Employee {
	
	String designation = "SW Developer";
	String address = "Pune";
	
	public static void main(String[] args) {
		
		Developer obj = new Developer(10);
		obj.display();
		
		Employee eobj = new Employee(10);  // to call only parametarized constructor.
	}
	
	public Developer(int a) {
		super(a);
		//this();
		//new Employee();
		System.out.println("Inside Developer Parameterized constructor");
	}

	void display() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Designation:"+designation);
		System.out.println("Employee Address:"+super.address);
		m1();
		super.m1();
	}
	void m1() {
		System.out.println("Inside Developer m1 method.");
	}
	
	
}
