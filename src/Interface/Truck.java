package Interface;

public interface Truck {
	
	public abstract int enginepower();
	
	void color();
	
	default void method3() {
		System.out.println("Inside default method 3");
	}
	
	static void method4() {
		System.out.println("Inside static method 4");
	}

}
