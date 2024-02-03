

public class StudentAnother {
	
	void printarray(Student[] Stuarr) {
		
		System.out.println("Inside StudentAnother class-");
		
		for (Student stu : Stuarr) {
			
			System.out.println("Roll no-"+stu.rollno);
			System.out.println("Name-"+stu.name);
			System.out.println("City-"+stu.city);
			System.out.println("Year-"+stu.year);
			System.out.println("Division-"+stu.division);
			System.out.println();
			
		}
		
	}

}
