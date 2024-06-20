package OptionalClassDemo;

import java.util.Optional;

public class OptionalClassDemo {
	
	public static void main(String[] args) {
		
	//	OptionalClassDemo obj = null;
		
		OptionalClassDemo obj = new OptionalClassDemo();
		
		
		Optional<OptionalClassDemo> object = Optional.ofNullable(obj);
		
		if (object.isPresent()) {
			obj.display();	
		} else {
            System.out.println("object is null");
		}
		
	}
	
	public void display() {
		
		System.out.println("From display method");
		
	}

}
