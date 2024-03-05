package staticKeyword;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.rno=1;
		obj1.name="Supriya";
		obj1.clgName="COEP";
		
		Student obj2 = new Student();
		obj2.rno=2;
		obj2.name="Saurabh";
		obj2.clgName="PCCOE";
		
		System.out.println(obj1.rno);
		System.out.println(obj1.name);
		System.out.println(obj1.clgName);
		
		System.out.println(obj2.rno);
		System.out.println(obj2.name);
		System.out.println(obj2.clgName);
		
		System.out.println(Student.clgName);
		
		Student obj3 = new Student();
		obj3.rno=3;
		obj3.name="Samruddhi";
		obj3.clgName="PREC";
		
		System.out.println(obj3.rno);
		System.out.println(obj3.name);
		System.out.println(obj3.clgName);	
		
		//Student obj = new Student();
		//obj.display();           //call by creating object of class
		
         Student.display(); //static method call by class name
         
        // StudentTest st = new StudentTest();
        //st.get();
         get();
         	
	}
	
	static void get() {
		System.out.println("Inside StudentTest Class");
	}

}
