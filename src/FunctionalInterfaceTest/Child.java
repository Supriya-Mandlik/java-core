package FunctionalInterfaceTest;

@FunctionalInterface

public interface Child extends FunctionalInterfaceDemo {
	
// it is also functional interface as it inherits one abstract method from FunctionalInterfaceDemo
	
	// void hii();  // we can not add more than one abstract methods in functional interface
	
	void Hello(); // we can override parent class abstract method in child class.
	
	default void save() {  // we can have multiple number of default methods
		
		System.out.println("Child save Method");
		
	}
	
	default void display() {
		System.out.println("Child display method");
	}
	
	static void get() {  // we can have multiple number of static methods
		
		System.out.println("Child get method");
		
	}

}
