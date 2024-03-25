package ExceptionHAndlingBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		//System.out.println(100/0);  // Arithmetic exception  // run time exception
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		
		
	
		// 1] checked exception or compile time exception
		
		//Whether file is present or not compiler force to handle exception i.e. compiler force to use  
		// try catch block to handle exception is called checked exception.
		
		//FileInputStream fis = new FileInputStream("d:/abc.txt");  //compile time exception	
		 // FileNotFoundException
	try {
		FileInputStream fis3 = new FileInputStream("C://Downloads/Basic.txt");
	}catch(FileNotFoundException e2) {
		e2.printStackTrace();
	}
		
	try {	  // exception Handling
    FileInputStream fis2 = new FileInputStream("d:/abc.txt");  //compile time exception
    // FileNotFoundException    // here this file is not present, so it will throw exception
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
	
		
		// 2] unchecked exception or run time exception
	
	try {    // exception Handling
		int a=100;
		int b=0;
		int c=a/b;
		System.out.println(c);     // ArithmeticException
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	
		
		//String s= null;
		//System.out.println(s.length());   // NullPointerException
	
	
	System.out.println("Hello");
	System.out.println("End");
		
	}

}
