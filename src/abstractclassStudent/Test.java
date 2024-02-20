package abstractclassStudent;

public class Test {
	
	public static void main(String[] args) {
		int rno=10;
		String name = "Supriya";
		
		
		Student obj = new StudentImplementation();
		
		obj.saveStudent(rno, name);
		obj.getStudent(rno);
		obj.display();
		
		
		//Student obj1 = new Student();    //cannot create object of abstract class
		//obj1.saveStudent(rno,name);
		//obj1.display();
		
	}

}
