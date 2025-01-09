package selectionstatement;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 4;
		
		switch(x)
		{
		case 1:
			System.out.println("Case 1 Executed");
			break;
			
		case 2:
			System.out.println("Case 2 Executed");
			break;
			
		case 3:
			System.out.println("Case 3 Executed");
			break;
			
			default:
				System.out.println("None of the cases are matching");
		}

	}

}
