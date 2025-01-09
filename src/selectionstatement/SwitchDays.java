package selectionstatement;

public class SwitchDays {

	public static void main(String[] args) {
		
		int day = 5;
		
		switch(day)
		{
		case 1:
			System.out.println("Horrifying Monday!");
			break;
			
		case 2:
			System.out.println("Terrfic Tuesday!");
			break;
			
		case 3:
			System.out.println("Mid Week Wednesday!");
			break;
			
		case 4:
			System.out.println("Thoughtful Thursday!");
			break;
			
		case 5:
			System.out.println("Happy Friday");
			break;
			
		case 6:
			System.out.println("Hangover Saturday Party Party");
			break;
			
		case 7:
			System.out.println("Sunday FamilyDay");
			break;
			
			default:
				System.out.println("None of the days are mathcing");
		}

	}

}
