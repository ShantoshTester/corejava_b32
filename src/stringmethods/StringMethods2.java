package stringmethods;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String name = "Shantosh";
		
		//charAt(index) - returns the character from the given index
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		// replace('oldchar','newchar');
		String place = "Australia";
		String replaced = place.replace('a', 'A');
		System.out.println(replaced);
		
		// concat(string) - appends 2 string
		String firstname = "Lucky";
		String lastname = "Bhaskar";
		System.out.println(firstname.concat(lastname));
		System.out.println(firstname+lastname);
		
		// contains - returns true/false
		System.out.println(name.contains("$"));

	}

}
