

public class StudentArray {
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.rollno=1;
		obj1.name="supriya";
		obj1.city="Akole";
		obj1.year=4;
		obj1.division='A';
		
		Student obj2 = new Student();
		obj2.rollno=2;
		obj2.name="Saurabh";
		obj2.city="Akole";
		obj2.year=4;
		obj2.division='A';
		
		Student obj3 = new Student();
		obj3.rollno=3;
		obj3.name="Ashwini";
		obj3.city="Loni";
		obj3.year=4;
		obj3.division='A';
		
		Student obj4 = new Student();
		obj4.rollno=4;
		obj4.name="Pratiksha";
		obj4.city="Sangamner";
		obj4.year=4;
		obj4.division='A';
		
	Student[] Stuarr = new Student[4];
	 Stuarr[0] = obj1;
	 Stuarr[1] = obj2;
	 Stuarr[2] = obj3;
	 Stuarr[3] = obj4;
		
	StudentArray obj = new StudentArray();
	obj.getarray(Stuarr);
	
	StudentAnother object = new StudentAnother();
	object.printarray(Stuarr);
	
		
	}
	
	void getarray(Student[] Stuarr) {
		
		for(int i=0;i<Stuarr.length;i++) {
			
			Student val = Stuarr[i];
			
			System.out.println("Roll no-"+val.rollno);
			System.out.println("Name-"+val.name);
			System.out.println("City-"+val.city);
			System.out.println("Year-"+val.year);
			System.out.println("Division-"+val.division);
			System.out.println();
			
		}
		
	}

}
