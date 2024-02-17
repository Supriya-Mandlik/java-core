package OverrideTestEmployee2;

public class Test {
	
	public static void main(String[] args) {
		
		Employee obj1 = new Manager();
		obj1.setName("Saurabh");
		obj1.setEmpId(10);
		obj1.setExpyear(5);
System.out.println("Manager Id is:" + obj1.getEmpId() + " ," + "Manager name is:" + obj1.getName() + 
				" , "+ "Manager Experiance year is:" + obj1.getExpyear() + " , " + "Manager Salary is:"
				+ obj1.IncrementSalary());
		
		Employee obj2 = new Developer();
		obj2.setName("Supriya");
		obj2.setEmpId(15);
		obj2.setExpyear(2);
System.out.println("Developer Id is:" + obj2.getEmpId() + " , " + "Developer name is:" + obj2.getName() + 
				" , "+ "Developer Experiance year is:" + obj2.getExpyear() + " , " + "Developer Salary is:"
				+ obj2.IncrementSalary());
		
		
	}

}
