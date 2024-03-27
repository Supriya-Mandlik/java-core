package FunctionalInterfaceTest;

public class Main implements Parent,Child{
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		
		obj.save();
		obj.display();   // both interface have same method name but different parameters.
		obj.display(10);
		obj.get();
		Child.get(); // We can access static methods of interface by interface name only.
		Parent.get();
		
	}

	@Override
	public void Hello() {
		// TODO Auto-generated method stub
		
	}
	
	/* if both interface default methods have same method name,then we have to override that method
	 in class and we have to use super kayword to access methods.*/
	
	public void save() {
		//Child.super.save();
		//Parent.super.save();
		System.out.println("Main save method");
	}
	
	void get() {
		System.out.println("Main get method");
	}

}
