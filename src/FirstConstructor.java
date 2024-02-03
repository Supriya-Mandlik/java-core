
public class FirstConstructor {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		FirstConstructor fobj = new FirstConstructor(10,20);
		
		System.out.println("After object Creation");
		
	}
	
	public FirstConstructor() {
		
		System.out.println("Default Constructor");
		
	}
    
	void display() {
		
	}
	
	public FirstConstructor(int a) {
		
		System.out.println("Welcome to Parameterized Constructor");
		
	}
	
    public FirstConstructor(int a,int b) {
		
		System.out.println("Welcome to two Parameterized Constructor");
		
	}
}
