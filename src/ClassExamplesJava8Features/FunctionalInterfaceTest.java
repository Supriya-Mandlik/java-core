package ClassExamplesJava8Features;

public class FunctionalInterfaceTest {
	
	public static void main(String[] args) {
		
		// Using Lambda Expression
		
  FunctionalInterfaceDemo LambdaObj = () -> System.out.println("Using Lambda Expression - display method");
		
		/* Lambda Expression can only written for Functional Interfaces means interfaces which have 
		only one abstract method.
		() = indicates method of interface.
		-> =  lambda.
		After Lambda we can write body for that method.
		We can access FunctionalInterface method by using lambda.
		By using Lambda Expression our code becomes Concise and compact(i.e small ) and readable.
		Lambda is a Programming style.
		*/
		
		// Using Anonymous Class
		
		FunctionalInterfaceDemo AnonymousObj = new FunctionalInterfaceDemo() 
		{ 
			/* Anonymous class - means the class which does not have name.
			  By this way we can create object of Interface .
			  In Anonymous class we can write body for abstract methods of interface.
			  Anonymous class can be used for FunctionalInterface(Single abstract method) as well as
			   normal interface(Which has more than one abstract methods*/
			
			@Override
			public void display() {
				System.out.println("Inside Anonymous Class - display method");
				
			}
		};
		
		LambdaObj.display();
		AnonymousObj.display();
	}
	
}
