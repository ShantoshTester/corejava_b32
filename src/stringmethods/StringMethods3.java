package stringmethods;

public class StringMethods3 {

	public static void main(String[] args) {
		
		String word = "Java Programming";
		
		// contains()
		System.out.println(word.contains("Java"));
		
		// substring(begin index)
		// substring(begin index, last index) - begin index is inclusive and last index is exclusive
		System.out.println(word.substring(0));
		System.out.println(word.substring(0, 5));
		
		String s1 = "Education";
		String s2 = "education";
		//equals
		//equalIgnoreCase
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		

	}

}
