package LambdaExpressionTest;

public class Main {

   public static void main(String[] args) {
	 
	   dosomething();
	
	   // using Lambda expression
    Employee obj = () -> "Software Engineer"; //implementation of abstract method of interface using lambda.
    System.out.println(obj.name());
    
    System.out.println("*------------------------------*");
    
    // using Anonymous inner class
    Worker obj2 = new Worker() {
		int x=10;     // instance variable because anonymous is class
		@Override
		public int salary() {
			System.out.println(this.x);   
			return 10000;
		}
		
		@Override
		public String designation() {
			
			return "Software Engineer";
		}
	};
	
	System.out.println(obj2.salary());
	System.out.println(obj2.designation());
	
   }
	
	public static void dosomething() {
		int x=10;      // local variable
		Employee obj3 = () -> {
			System.out.println(x);      
			return "Software Engineer"; 
		 };
		 System.out.println(obj3.name());
		 
	 	
    }
}
