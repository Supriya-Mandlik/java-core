package StringAssignment;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";
		
		System.out.println("Given String is::"+str);
		
		String rev = "";
		
		String[] arrwords = str.split(" "); //[Java,Concept,Of,The,Day] array of words.
		
		for (String word : arrwords) {
			
			// reverse word
			String revword = "";
			
			for(int i=word.length()-1;i>=0;i--) {
				revword =revword+word.charAt(i);
			}
			
			rev =rev+revword+" ";
			
		}
		
		System.out.println("Reverse of Each Word is::"+rev);
		
		/*for(int i=0;i<arrwords.length;i++) {
			String word = arrwords[i];
			
			String revword = "";
			for(int j=word.length()-1;j>=0;j--) {
				revword = revword + word.charAt(j);
			}
			rev = rev + revword +" ";
		}
		System.out.println("Reverse of each word is::"+rev);*/
		
	}

}
