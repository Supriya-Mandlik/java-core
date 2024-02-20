package Interface;

public interface Car {
	
	public abstract int enginepower();

	void color();      //public abstract is bydefault
	
	default void method1() {
		System.out.println("Inside default method 1");
	}
	
	static void method2() {
		System.out.println("Inside static method 2");
	}

}
