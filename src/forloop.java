

public class forloop {
	public static void main(String[] args) {
		
		forloop obj = new forloop();
		obj.printNumbers();
		obj.printTable();
		obj.whileloop();
		obj.dowhile();
	}
	void dowhile() {
		System.out.println("Print numbers using do while loop");
		int i=5;
		do {
			System.out.println(i);
			i--;
			
		}while(i>=1);

	}
		
	void whileloop() {
		
		System.out.println("Print numbers using while loop");
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
		void printTable() {
			System.out.println("Table using extra variable");
			int j=5;
			for(int i = 1;i<=10;i++) {
				if(i==4)
				continue;
				System.out.println(i*j);
			}
			
			System.out.println("Table using one variable");
			for(int i=5;i<=50;i=i+5) {
				System.out.println(i);
				
			}
			
			System.out.println("Table using modulo operator");
			for(int i=5;i<=50;i++) {
				if(i%5==0) {
					System.out.println(i);
				}
				}
			}
			
				
		void printNumbers() {
			
			System.out.println("print numbers in Reverse order");
			
		for(int i = 5 ; i>=1 ; i--) {
			System.out.println(i);
				
		}
		}
	}


