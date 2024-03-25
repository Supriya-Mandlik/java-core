package CheckedCustomizedException;

public class Votting {
	
	public static void main(String[] args) {
		
		int age = 16;
		
		try
		{
		if (age<18) {
			 
			//no argument constructor 
			throw new UnderAgeException();
			
			// parametarized constructor
			//throw new UnderAgeException("You can not vote as you are Under Age!");
			
		} else {
			
			System.out.println("You can Vote!");

		}
		}
		catch(UnderAgeException uae)
		{
			uae.printStackTrace();
		}
		}
		
	
	
	
	// Or
	
	
	
	/*
	public static void main(String[] args) throws UnderAgeException {
		
		int age = 17;
		
		if (age<18) {

			throw new UnderAgeException();

		} else {
			
			System.out.println("You can Vote!");

		}
		
	}*/

}
