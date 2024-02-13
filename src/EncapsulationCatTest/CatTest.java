package EncapsulationCatTest;

public class CatTest {
	
    public static void main(String[] args) {
	
    Cat C = new Cat();
    C.feed();
    C.sleep();
    C.play();
    
    System.out.println("Energy:"+C.getEnergy());
    System.out.println("Hungry:"+C.getHungry());
    System.out.println("Mood:"+C.getMood());
    
  }
}
