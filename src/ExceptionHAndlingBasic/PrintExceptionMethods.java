package ExceptionHAndlingBasic;

public class PrintExceptionMethods {
	
	public static void main(String[] args) {
		
	 try
	 {
		 int a=100 , b=0 , c;
		 c=a/b;
		 System.out.println(c);
		 
	 }
	 catch(Exception e)
	 {
		// 1] method
		e.printStackTrace(); 
		
		// 2] method
		System.out.println(e);
		System.out.println(e.toString());
		
		// 3] method
		System.out.println(e.getMessage());
		 
	 }
	 
	}

}
