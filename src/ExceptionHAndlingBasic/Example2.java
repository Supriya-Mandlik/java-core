package ExceptionHAndlingBasic;

public class Example2 {
	
	public static void main(String[] args) {
		
		try {
			
			int a=100 , b=2 , c;
			c=a/b;
			System.out.println(c);
			
			String s1 =null;
			try {
				System.out.println(s1.charAt(1));
			}
			catch(NullPointerException np) {
				System.out.println(np);
			}
				
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException npe) {
			System.out.println(npe);
		}
		
		
		try {
             int[] arr = new int[1];
			System.out.println(arr[1]);
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		}
	    
	}

}
