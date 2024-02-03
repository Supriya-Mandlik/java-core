
public class StudentConstructor {
	
	int rno;
	String name;
	
	public static void main(String[] args) {
		
		StudentConstructor obj = new StudentConstructor(1,"kiran");	
		
	}
	
	public StudentConstructor(int rno,String name) {
		
		this.rno = rno;
		this.name = name;
		System.out.println("Roll no is:"+rno+" "+"Name is:"+name);
		
	}

}
