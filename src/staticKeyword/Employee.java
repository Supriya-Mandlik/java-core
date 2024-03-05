package staticKeyword;

public class Employee {
	
	static int empId;  //static variable can access with class and object
	static String name;
	String address;    //instance variable can accessed with object only
	
	static {      //static block
		System.out.println("Inside static block 1");
		empId=10;
		name="Supriya";  //static   variable
		//address="Akole";    //non-static   variable
	}
	
	static {   
	  System.out.println("Inside static block 2");
	  empId=20;
	  name="Saurabh";
	}
	
	public Employee() {    //constructor
		empId=30;         //static variable
		name="Samruddhi";   //static variable
		address="Akole";     //instance variable

     System.out.println("Inside Default Constructor");
	}
	
	{                 //non-static   block
		name="sup";   //static    variable
		address="Sangamner";   //instance   variable
		System.out.println("Inside Non-static block 1");
		System.out.println(name);
		System.out.println(address);
	}
	
	{
		System.out.println("Inside Non-static block 2");
	}
	
	public Employee(int a) {
		System.out.println("Inside one parameter constructor");
	}
	
	public Employee(int empId,String name,String address) {
		this(1);
		this.empId=empId;
		this.name=name;
		this.address=address;
		System.out.println("Inside 3 Parameter constructor");
	}
	
	public static void main(String[] args) {     //static method
		
		System.out.println("Inside Employee Main Method");
		
		System.out.println(Employee.empId);   //static variable
		System.out.println(name);             //static variable
		
		Employee obj = new Employee();
		System.out.println(empId);
		System.out.println(Employee.name);
		System.out.println(obj.address);      //instance variable
		
		Employee obj1 = new Employee(10);
		
		Employee obj2 = new Employee(40,"Advik","Pune");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(obj2.address);
		
		Employee em = new Employee();
		em.display();
		
	}
	
	void display() {    //non-static method
		empId=50;       //static variable
		name="Sumbul";    //static variable
		address="Mumbai";   //instance variable
		System.out.println("Inside Display Method");
		System.out.println(empId);
		System.out.println(name);
		System.out.println(address);
	}

}
