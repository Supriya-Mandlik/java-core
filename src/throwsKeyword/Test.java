package throwsKeyword;

import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		ReadAndWrite rw = new ReadAndWrite();
		
		try
		{
		 rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
		rw.saveFile();
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		
		System.out.println("End");
		
	}

}
