package StringBasic;

public class StringBuilderTest {
	
	public static void main(String[] args) {
			
		StringBuilder s = new StringBuilder("CodeMind");
		s.append(" Technology");
		System.out.println(s);
		
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		System.out.println(sb1.equals(sb2));
		
		StringBuilder sb3 = sb1.append(" programming");
		System.out.println(sb1.equals(sb3));
		
	}

}
