

public class EmployeeAnother {
	
	void printarray(Employee[] Emparr) {
		
		System.out.println("Inside EmployeeAnother Class-");
		
		for (Employee emp : Emparr) {
			
			System.out.println(emp.toString());
			//emp.toString1();
			//System.out.println("Employee name:"+emp.getName());
			//System.out.println("Employee Age:"+emp.getAge());
			//System.out.println("Employee Experience Year:"+emp.getExpyear());
			//System.out.println("Employee Mobile number:"+emp.getMobno());
			System.out.println();
			
			
		}
		
	}

}
