package selectionstatement;

public class FindLargest {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 63;
		int num3 = 103;

		if (num1 > num2 & num1 > num3) 
		{
			System.out.println(num1 + " is largest given number");
		}
		else if (num2 > num3 & num2 > num1)
		{
			System.out.println(num2 + " is largest given number");
		}
		else if (num3 > num1 & num3 > num2) 
		{
			System.out.println(num3 + " is largest given number");
		}

	}

}
