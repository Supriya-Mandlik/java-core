package StringBasic;

public class StringConstructorsTest {
	
	public static void main(String[] args) {
		
		// 1] public String(){}
		
		String s = new String();
		System.out.println(s.length());
		// No argument Constructor Creates Empty object.
		
		// 2] public String(String s){}
		
		String s1 = new String("CodeMind");
		System.out.println(s1);
		
		//We can pass string as String constructor parameter
		//String constructor. it creates two objects one at heap and second at scp.
		
		// 3] public String(StringBuffer sb){}
		
		StringBuffer sb = new StringBuffer("Supriya");
		String s2 = new String(sb);
		System.out.println(s2);
		
		// we can pass StringBuffer object as string constructor parameter
		
		// 4] public String(StringBuilder sb){}
		
		StringBuilder sb1 = new StringBuilder("Supriya");
		String s3 = new String(sb1);
		System.out.println(s3);
		
		// we can pass StringBuilder object as string constructor parameter
		
		// 5] public String(byte[] b){}
		
		byte[] b = {101,102,103};
		String s4 = new String(b);
		System.out.println(s4);
		
		// we can pass byte array as string constructor parameter
		
		// 6] public String(char[] ch){}
		
		char[] ch = {'a','b','c'};
		String s5 = new String(ch);
		System.out.println(s5);
		
		// we can pass char array as string constructor parameter
		
	}

}
