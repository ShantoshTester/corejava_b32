package revision;

public class StudentStatic {
	
	String name;
	int id;
	char gender;
	static String batch = "B32";
	
	public static void main(String[] args) {
		
		StudentStatic s1 = new StudentStatic();
		s1.name = "pallavi";
		s1.id = 1001;
		s1.gender = 'F';
		System.out.println("Details of Student S1");
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.gender);
		System.out.println(StudentStatic.batch);
		System.out.println("*************************");
		
		StudentStatic s2 = new StudentStatic();
		s2.name = "shantosh";
		s2.id = 1002;
		s2.gender = 'M';
		System.out.println("Details of Student S2");
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.gender);
		System.out.println(StudentStatic.batch);
		System.out.println("*************************");
		
	}

}
