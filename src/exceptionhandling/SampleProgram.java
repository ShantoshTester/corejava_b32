package exceptionhandling;

public class SampleProgram {

	public static void main(String[] args) 
	{
		
			System.out.println("Program Started");
			System.out.println("01 executed");
			System.out.println("02 executed");
			System.out.println("03 executed");
			System.out.println("04 executed");
			System.out.println("05 executed");
			try
			{
				int a = 10;
				int b = 0;
				int c = a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println("exception occured");
				e.printStackTrace();
			}
			
			System.out.println("06 executed");
			System.out.println("07 executed");
			System.out.println("08 executed");
			System.out.println("09 executed");
			System.out.println("10 executed");
			System.out.println("Program Ended");
		
		
	
	}

}
