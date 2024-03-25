package UncheckedCustomizedException;

public class Votting {
	
	public static void main(String[] args) {

		int age =17;
		
		try
		{
		if (age<18) {
			
			throw new UnderAgeException();
		   //throw new UnderAgeException("You can not vote as you are under age!");
			
		} else {
			
			System.out.println("You can Vote!");

		}
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
	
		System.out.println("End");
		
	}

}
