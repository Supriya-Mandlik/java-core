package finalKeyword;

public class Developer //extends Employee 
{
	//we cannot inherit the final class
	//we cannot make child of final class
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		//obj.companyName="Infosys";
		obj.m1();
		
		Developer dobj=new Developer();
		//dobj.m1();
		
	}
	
	/*void m1() {               //cannot ovverride the final method
		System.out.println("Inside Developer m1 method");
	}*/

}
