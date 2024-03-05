package staticKeyword;

public class Student {
	
	int rno;
	String name;
	static String clgName;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	
	static void display() {                            //static method
		System.out.println("Inside Display Method");
	}

}
