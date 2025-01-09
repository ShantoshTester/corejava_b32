package revision;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int n1 = 30;
		int n2 = 50;
		int n3 = 60;
		
		if(n1>n2 & n1>n3)
		{
			System.out.println(n1+" n1 is largest number");
		}
		else if(n2>n1 & n2>n3)
		{
			System.out.println(n2+" n2 is largest number");
		}
		else if(n3>n1 & n3>n2)
		{
			System.out.println(n3+" n3 is largest number");
		}

	}

}
