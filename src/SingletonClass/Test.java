package SingletonClass;

public class Test {
	
	public static void main(String[] args) {
		
		Student st1 = Student.getInstance(); //static methods can access with class name
		Student st2 = Student.getInstance();
		// we can use same object many times using the method
		
		st1.setRollno(1);
		st1.setName("Supriya");
		System.out.println("Rollno:"+st1.getRollno()+" "+"name:"+st1.getName());		
		
		st2.setRollno(2);
		st2.setName("Sumruddhi");
		System.out.println("Rollno:"+st2.getRollno()+" "+"name:"+st2.getName());		
		
		
	}

}
