package FunctionalInterfaceTest;

@FunctionalInterface  // Functional Interface

public interface FunctionalInterfaceDemo {
	
	void Hello(); // abstract method
	
	// void hii();  // we can not add more than one abstract methods in functional interface
	
	 default void Welcome() {  // we can have multiple number of default methods
		 
	 }
	 
	 default void save() {
		 
		 System.out.println("Functional Interface save Method");
		 
	 }
	 
	 static void GoodBye() {    // we can have multiple number of static methods
		 
	 }
	 
	 static void get() {
		 
	 }

}
