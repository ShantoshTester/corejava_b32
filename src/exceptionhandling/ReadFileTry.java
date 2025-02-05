package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileTry {

	public static void main(String[] args) 
	{
       try
       {
   		System.out.println("Program Started");
   		File file = new File("./src/exceptionhandling/file.txt");
   		FileInputStream fis = new FileInputStream(file);
   		fis.close();
       }
       catch(FileNotFoundException fof)
       {
    	   fof.printStackTrace();
       }
       catch(IOException io)
       {
    	   io.printStackTrace();
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
	}

}
