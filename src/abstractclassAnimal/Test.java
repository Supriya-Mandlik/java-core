package abstractclassAnimal;

public class Test {
	
	public static void main(String[] args) {
		
		Animals obj1 = new Cat();
		obj1.eat();
		obj1.sound();
		
		obj1 = new Dog();
		obj1.eat();
		obj1.sound();
		
	}

}
