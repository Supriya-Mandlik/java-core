package abstractclassStudent;

public class StudentImplementation extends Student {
	
	void saveStudent(int rno , String name) {
		System.out.println("Save Student details in database");
	}

	@Override
	void getStudent(int rno) {
		System.out.println("Get student information");
		
	}
	
	public StudentImplementation() {
		//super();
		System.out.println("Inside StudentImplementation class constructor");
	}
	

}
