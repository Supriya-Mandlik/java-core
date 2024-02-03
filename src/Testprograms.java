

public class Testprograms {
	public static void main(String[] args) {
		
		Testprograms obj = new Testprograms();
		obj.sum();
		obj.print();
		
	}
	void sum() {
		
		int sum=0;
		for(int i=1;i<=10;i++) {
		sum = sum+i;		
	}
		System.out.println(sum);
	}
	
	void print() {
		for(int i=1;i<=5;i++) {
			System.out.println("Welcome to Eclipse");
		}
	}
}

	