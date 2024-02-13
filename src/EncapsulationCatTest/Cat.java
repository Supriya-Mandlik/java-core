package EncapsulationCatTest;

public class Cat {
	
	private int energy = 50;
	private int hungry = 60;
	private int mood = 50;
	
	void feed() {
		energy++;
		hungry--;
		mood++;
		meow();
	}
    
	void sleep() {
		System.out.println("Cat sleep....");
		energy++;
		hungry++;
	}
	
	void play() {
		energy--;
		hungry++;
		mood++;
		meow();
	}
	
	private void meow() {
		System.out.println("Meow");
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getHungry() {
		return hungry;
	}
	
	public int getMood() {
		return mood;
	}
}
