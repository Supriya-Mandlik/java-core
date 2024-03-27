package FunctionalInterfaceTest;

public interface Parent {
	
	// in java 8 we can write main method in interface.
	
	public static void main(String[] args) {
		
	}
	
	default void save() {
		System.out.println("Parent save method");
		
	}
	
	default void display(int a) {
		System.out.println("Parent display method");
	}
	
     static void get() { 
		
		System.out.println("Parent get method");
		
	}

}
