package OverrideTestCar;

public class Engine extends Sedan {
	
	void fuel() {
		System.out.println("Converting diesel to smooth motion!");
	}
	
	public static void main(String[] args) {
		
		Car a1,a2,a3;
		
		a1 = new Car();
		a2 = new Sedan();
		a3 = new Engine();
		
		a1.fuel();
		a2.fuel();
		a3.fuel();
		
		//Car E = new Engine();
		//E.fuel();
		
	}

}
