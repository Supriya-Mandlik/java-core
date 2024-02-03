

import java.util.Iterator;

public class Loop {
	
	public static void main(String[] args) {
		
		Loop obj = new Loop();
		obj.forloop();
		obj.print();
		obj.While();
		obj.Dowhile();
	}
	
	void forloop() {
		
		System.out.println("Print table using one variable");
		for(int i=2;i<=20;i=i+2) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Print table using modulo operator");
		for(int i=2;i<=20;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Print table using extra variable");
		int j=2;
		for(int i=1;i<=10;i++) {
			
			System.out.println(i*j);
			
		}
		
	}
	void print() {
		
		for(int i=10;i>=0;i--) {
			
			System.out.println(i);
			
		}
	}
	
	void While() {
		
		System.out.println("Print table using While loop");
		int i=1;
		int j=2;
		while(i<=10) {
			System.out.println(i*j);
			i++;
		}
		
	}
	
	void Dowhile() {
		
		System.out.println("Print table using do while loop");
		int j=2;
		int i=1;
		do {
			System.out.println(i*j);
			i++;
		} while (i<=10);
		
	}

}
