package ExceptionHAndlingBasic;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		try 
		{
		    int a=100 , b=2 , c;
		    c=a/b;
		    System.out.println(c);
		}
		catch(Exception e)
		{
		    System.out.println(e);	
		}
		finally
		{
		    System.out.println("finally Block");	
		}
		
		System.out.println("*-----------------------------*");
		
		try 
		{
		    int a=100 , b=0 , c;
		    c=a/b;
		    System.out.println(c);
		}
		finally
		{
		    System.out.println("finally Block");	
		}
		
	}

}
