package arraysdemo;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		num[0] = 100; // lower bound of an array
		num[1] = 300;
		num[2] = 500;
		num[3] = 600;
		num[4] = 200; // size - 1 is called upper bound of an array
		
		// length()-this method will return you the length(size) of an array.
		int size = num.length;
		System.out.println("size of an given array : "+size);
		
		// accessing the elements using index
		System.out.println(num[0]);
		System.out.println(num[4]);
//		System.out.println(num[5]);
		
		System.out.println("printing all the elements using for loop");
		
		for(int i=0; i<size; i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("printing all the elements using advance for loop");
		
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		System.out.println("*************************************************************");
		
		
		char vowels[]=new char[5];
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		
		System.out.println("printing char vowels");
		
		for(char vowel:vowels)
		{
			System.out.println(vowel);
		}
		
		System.out.println("*************************************************************");
		
		int age[] = new int[3];
		age[0] = 10;
		age[1] = 10;
		age[2] = 10;
		
		for(int ageValue:age)
		{
			System.out.println(ageValue);
		}
	
	}

}










