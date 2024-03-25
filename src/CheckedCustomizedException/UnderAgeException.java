package CheckedCustomizedException;

public class UnderAgeException extends Exception {
	
	// No argument Constructor
	
	public UnderAgeException() {
		
		super("You are Under Age!");
		
	}
	
	// parametarized constructor
	
	public UnderAgeException(String message)
	{
		super(message);
	}
	

}
