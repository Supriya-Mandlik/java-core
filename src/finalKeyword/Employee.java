package finalKeyword;

public final class Employee {
	
	final String companyName="Codemind Technology";   //final variables can initialized only once
	
	final int val;
	
	public static final int num;
	
	static{
		num=50;     //static blank final field
	}
	
	{
		//val=10;    //Blank final field
	}
	
	public Employee() {
		
		val=10;    //The blank final field
		
	}

	
	public static void main(String[] args) {
		
		
		
	}
	
	final void m1() {
		
		//companyName="Vipro";      // cannot initialized the final variable again
		System.out.println("Inside Employee m1 method");
	}

}
