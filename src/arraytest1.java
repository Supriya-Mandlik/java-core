

public class arraytest1 {
	public static void main(String[] args) {
		int[] rollnum = new int[10];
		 
		//rollnum[0]=1;
		//rollnum[1]=2;
		//rollnum[2]=3;
		//rollnum[3]=4;
		arraytest1 obj = new arraytest1();
		obj.getarrayvalue(rollnum);
		
	}
void getarrayvalue(int[] rollnum) {
	//System.out.println(rollnum[0]);
	//System.out.println(rollnum[1]);
	//System.out.println(rollnum[2]);
	//System.out.println(rollnum[3]);
	//System.out.println(rollnum[4]);
	for(int i=0;i<rollnum.length;i++) {
		
		System.out.println(rollnum[i]);
		
	}
}
}
