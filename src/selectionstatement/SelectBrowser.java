package selectionstatement;

public class SelectBrowser {

	public static void main(String[] args) {
		
		String browser = "opera";
		
		switch(browser)
		{
		case "chrome":
			System.out.println("Performing the Test Cases Using Chrome Browser");
			break;
			
		case "edge":
			System.out.println("Performing the Test Cases Using Edge Browser");
			break;
			
		case "firefox":
			System.out.println("Performing the Test Cases Using Firefox Browser");
			break;
			
			default:
				System.out.println("Unsupported Browser");
		}

	}

}
