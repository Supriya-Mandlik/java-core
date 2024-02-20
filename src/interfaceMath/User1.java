package interfaceMath;

public class User1 implements Math {

	@Override
	public void add() {
		int c = a+b;
		System.out.println("Addition is:"+c);
		
	}

	@Override
	public void sub() {
	    int a =50;
	    int b= 40;
	    int c=a-b; 
		System.out.println("Substraction is:"+c);
		
	}
	

}
