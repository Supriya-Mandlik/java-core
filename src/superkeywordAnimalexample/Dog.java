package superkeywordAnimalexample;

public class Dog extends Animal {
	
	public String type="mammal";
	
	public void display() {
		
		System.out.println("I am a Dog.");
		
	}
	
	public Dog() {
		System.out.println("Inside Dog default constructor.");
	}
	
	Dog(String type){
		super("animal");
		System.out.println("Inside Dog parameterized constructor.");
	}
	
	public void printmessage() {
		
		System.out.println("Calling variable of subclass:"+type);
		System.out.println("Calling variable of superclass of same name:"+super.type);
		
		display();    //calling display method of subclass.
		super.display();  //calling display method of superclass.
	}

}
