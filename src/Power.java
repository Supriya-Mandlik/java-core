

import java.util.Scanner;

public class Power {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base number-");
	int basenum = sc.nextInt();
	System.out.println("Enter power number-");
	int powernum = sc.nextInt();
	int multi = 1;
	int i=1;
	
	/*for(int i =1;i<=powernum;i++) {
		multi = multi*basenum;
	}
	System.out.println("power is-"+multi);*/
	
	while (i<=powernum) {
		multi = multi*basenum;
		i++;
		
	}
	System.out.println("power is-"+multi);
	
}
}
