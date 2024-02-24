package thiskeyword;

public class thiskeyword {
	
	int rno;
	String name;
	
	public thiskeyword(int rno,String name) {
		
		this();  //calling constructor by using this keyword.
		thiskeyword obj = new thiskeyword();  //it also calls default constructor.
        this.rno=rno; //method parameter value are given to instance variable using this keyword to avoid ambiguity.
		this.name=name;
		new thiskeyword();  //by creating new object calling constructor.
		
	}
	public thiskeyword() {
		System.out.println("Inside default Constructor");
	}
	
	public static void main(String[] args) {
		
		thiskeyword obj = new thiskeyword(1,"supriya");
		System.out.println("Student Roll Number is:"+obj.rno);
		System.out.println("Student Name is:"+obj.name);
		//object is a reference variable.
		//this is a reference variable that refers to the current class object.
		obj.n();
		
	}
	
	void n() {
		System.out.println("Inside n method");
  m(); //this.m(); compiler automatically put this infront of m because both methods are of same class.
	}
	void m() {
		System.out.println("Inside m method");
	}

}
