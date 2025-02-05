package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Program Started");
		File file = new File("./src/exceptionhandling/file.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.close();
	}

}
