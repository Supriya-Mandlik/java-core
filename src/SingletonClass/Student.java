package SingletonClass;

public class Student {
	
	int rollno;
	String name;
	
	static Student st = new Student();
	
	private Student() {
		System.out.println("Constructor will invoke for only one object");
	}
	
	static Student getInstance() {
		return st; // static method can only access static members 
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
