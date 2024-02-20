package Interface;

public class Test {
	public static void main(String[] args) {
		
		Tata obj = new Tata();
		obj.color();
		obj.enginepower();
		obj.method1();
		obj.method3();
		Car.method2();   /*because method 2 is static method of interface and it can be accessed
		                   only through interface name*/
		Truck.method4();
	}

}
