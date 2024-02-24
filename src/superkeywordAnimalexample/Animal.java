package superkeywordAnimalexample;

public class Animal {
	
	protected String type="animal";
	
	public void display() {
		System.out.println("I am an Animal.");
	}
	
	public Animal() {
		System.out.println("Inside Animal Default Constructor.");
	}
	
	Animal(String type){
		System.out.println("Inside Animal parameterized constructor.");
	}

}
