package stringmethods;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = " Hello World ";
		
		// length() - returns int as the output
		int length = str.length();
		System.out.println("length of the given string : "+length);
		System.out.println("length of the given string : "+str1.length());
		
		// trim() - trims the trailing and preceding empty spaces
		System.out.println("actual string :"+str1);
		System.out.println("trimmed string :"+str1.trim());
		System.out.println("actual string :"+str1.length());
		System.out.println("actual string :"+str1.trim().length());
		
		// toUpperCase() and toLowerCase() - converts the case to upper to lower
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

	}

}
