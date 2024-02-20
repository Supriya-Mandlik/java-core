package abstractclassStudent;

public abstract class Student {
	
	abstract void saveStudent(int rno , String name);
	
	abstract void getStudent(int rno);
	
	void display() {
		
		System.out.println("Display student information");
		
	}
	
	public Student() {     //constructor
		System.out.println("Inside abstract class student constructor");
	}

}
