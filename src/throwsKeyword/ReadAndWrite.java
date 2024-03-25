package throwsKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ReadAndWrite  {
	
	void readFile()throws FileNotFoundException
	{
		
		FileInputStream fis = new FileInputStream("d:/abc.txt");
		
		
	}
	
	void saveFile() throws FileNotFoundException
	{
		
		FileOutputStream fos = new FileOutputStream("d:/xyx.txt");
		
	}

}
