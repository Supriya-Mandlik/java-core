package ExceptionHAndlingBasic;

public class WithoutExceptionHand {
	
	void CalculateDivision(int b) {
		
		int num = 20;
     try {
		System.out.println("Division is:"+20/b);
	}
	catch(Exception e) {
		System.out.println("Exception occurred:"+e);
	}
			
	}
	
	
	public static void main(String[] args) {
		
		try {
		WithoutExceptionHand obj = new WithoutExceptionHand();
		obj.CalculateDivision(10);
		obj.CalculateDivision(20);
		obj.CalculateDivision(0);
		obj.CalculateDivision(5);
		obj.CalculateDivision(2);
		obj.CalculateDivision(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		int[] arr = new int[2];
		arr[0]=10;
		arr[1]=20;
		
		for(int i=0;i<=10;i++) {
			System.out.println("Numbers-"+i);
		}
		
		
		try {
		System.out.println("Array Element-"+arr[0]);
		System.out.println("Array Element-"+arr[1]);
		System.out.println("Array Element-"+arr[2]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		for(int i=11;i<=20;i++) {
			System.out.println("Numbers-"+i);
		}
		
	}
	
}
