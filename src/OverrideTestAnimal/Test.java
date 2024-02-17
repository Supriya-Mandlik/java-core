package OverrideTestAnimal;

public class Test {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.printSound();
		
		Animal a2 = new Cat();
		a2.printSound();
		
		Animal a3 = new Dog();
		a3.printSound();
		
		Animal a4 = new Pig();
		a4.printSound();
		
	}

}
