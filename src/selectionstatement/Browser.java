package selectionstatement;

public class Browser {

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser == "chrome") 
		{
			System.out.println("Execute the test cases using Chrome");
		} 
		else if (browser == "firfox") 
		{
			System.out.println("Execute the test cases using Firefox");
		} 
		else if (browser == "edge") 
		{
			System.out.println("Execute the test cases using Edge");
		} 
		else 
		{
			System.out.println("Unsupported Browser");
		}

	}

}
