package stringmethods;

public class StringImutable {

	public static void main(String[] args) {
		
		String n1 = "Hello";
		String n2 = "Hello";
		String n3 = "hello";
		String n4 = "hellO";
		String n5 = "Hello";
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(n3.hashCode());
		System.out.println(n4.hashCode());
		System.out.println(n5.hashCode());

	}

}
