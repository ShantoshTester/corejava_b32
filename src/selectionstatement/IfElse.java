package selectionstatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		System.out.println("Please enter your age : ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Allow the User to Register");
		}
		else
		{
			System.out.println("Minimum age should be above 18");
		}
		
		scan.close();

		
	}

}
