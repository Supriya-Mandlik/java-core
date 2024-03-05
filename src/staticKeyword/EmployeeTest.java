package staticKeyword;

public class EmployeeTest {
	
	public static void main(String[] args) {
		System.out.println("Inside EmployeeTest Main Method");
		System.out.println(Employee.empId);
		System.out.println(Employee.name);
		
		Employee emp = new Employee();
		/*when class get call static blocks will execute first and when constructor get call  
	     non-static block will execute first*/
	}

}
