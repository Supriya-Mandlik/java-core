package ExceptionHAndlingBasic;

public class TryCatchExample {
	
	public static void main(String[] args) {

		// when exception does not occure
		
		System.out.println("Hello");
		try 
		{
			System.out.println("2");
			int a=100, b=2, c;
			System.out.println("3");
			c=a/b;
			System.out.println("4");
			System.out.println(c);
			System.out.println("5");
			
		}
		catch(Exception e)
		{
			System.out.println("6");
		    System.out.println(e);
		    System.out.println("7");
		}
		
		System.out.println("*----------------------------------------*");
		
		// when exception occures
		
		try 
		{
			System.out.println("2");
			int a=100, b=0, c;
			System.out.println("3");
			c=a/b;            // exception occurs at this line
			System.out.println("4");
			System.out.println(c);
			System.out.println("5");
			
		}
		catch(Exception e)
		{
			System.out.println("6");
		    System.out.println(e);
		    System.out.println("7");
		}
		
		System.out.println("End");
		
		
	}

}
