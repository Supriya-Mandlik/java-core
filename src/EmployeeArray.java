

public class EmployeeArray {
	
	public static void main(String[] args) {
	
	EmployeeArray obj = new EmployeeArray();
	Employee[] Emparr = obj.addEmployeeInArray();
	obj.getarray(Emparr);
	
	EmployeeAnother object = new EmployeeAnother();
	object.printarray(Emparr);
	
	}
	
	Employee[] addEmployeeInArray() {
		
		Employee obj1 = new Employee();
		obj1.setName("Supriya");
		//obj1.name = "Supriya";
		obj1.setAge(24);
		//obj1.age = -24;
		obj1.setExpyear(2);
		//obj1.expyear = 2;
		obj1.setMobno(1234);
		//obj1.mobno = 1234;
		
		Employee obj2 = new Employee();
		obj2.setName("Saurabh");
		//obj2.name = "Saurabh";
		obj2.setAge(26);
		//obj2.age = -26;
		obj2.setExpyear(4);
		//obj2.expyear = 4;
		obj2.setMobno(12345);
		//obj2.mobno = 12345;
		
		Employee obj3 = new Employee();
		obj3.setName("Kiran");
		//obj3.name = "Kiran";
		obj3.setAge(29);
		//obj3.age = 29;
		obj3.setExpyear(6);
		//obj3.expyear = 6;
		obj3.setMobno(123456);
		//obj3.mobno = 123456;
		
		Employee obj4 = new Employee();
		obj4.setName("Samruddhi");
		//obj4.name = "Samruddhi";
		obj4.setAge(25);
		//obj4.age = 25;
		obj4.setExpyear(3);
		//obj4.expyear = 3;
		obj4.setMobno(1234567);
		//obj4.mobno = 1234567;
		
		Employee[] Emparr = new Employee[4];
		Emparr[0] = obj1;
		Emparr[1] = obj2;
		Emparr[2] = obj3;
		Emparr[3] = obj4;
		
		return Emparr;
		
	}
	
	void getarray(Employee[] Emparr) {
		
		for(int i=0 ; i<Emparr.length ; i++) {
			
			Employee val = Emparr[i];
			
			//val.toString1();
			//System.out.println("Employee name:"+val.getName());
			//System.out.println("Employee Age:"+val.getAge());
			//System.out.println("Employee Experience Year:"+val.getExpyear());
			//System.out.println("Employee Mobile number:"+val.getMobno());
			//System.out.println("Employee name:"+val.name);
			//System.out.println("Employee Age:"+val.age);
			//System.out.println("Employee Experience Year:"+val.expyear);
			//System.out.println("Employee Mobile number:"+val.mobno);
			System.out.println(val.toString());
			System.out.println();
			
		}
		
	}

}
