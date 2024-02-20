package Interface;

public class Tata implements Car,Truck {

	@Override
	public int enginepower() {
		System.out.println("Inside Tata class");
		return 0;
	}
	
	public void color() {
		System.out.println("Black");
	}
	
	

}
