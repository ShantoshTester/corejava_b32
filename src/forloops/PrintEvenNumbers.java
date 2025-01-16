package forloops;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// Program to print only even numbers from 10 to 1
		
		for(int i=10; i>=1; i--)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}

	}

}
