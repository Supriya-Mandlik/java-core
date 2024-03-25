package UncheckedCustomizedException;

public class UnderAgeException extends RuntimeException {
	
	// no argument constructor
	public UnderAgeException() {
		super("You can not vote!");
	}
	
	// parametarized constructor
	public UnderAgeException(String msg){
		super(msg);
	}

}
