package constructorsdemo;

public class Student {
	
	String studentName;
	int studentId;
	char studentGen;
	boolean isEnrolled;

	
	public static void main(String[] args) 
	{
		Student e1 = new Student();
		e1.studentName = "shruthi";
		e1.studentId = 1001;
		e1.isEnrolled = true;
		System.out.println("Details of Student S1");
		System.out.println(e1.studentName+" "+e1.studentId+" "+e1.studentGen+" "+e1.isEnrolled);
		System.out.println("*******************************");
		
		Student e2 = new Student();
		e2.studentName = "shantosh kumar";
		e2.studentGen = 'M';
		e2.isEnrolled = true;
		System.out.println("Details of Student S2");
		System.out.println(e2.studentName+" "+e2.studentId+" "+e2.studentGen+" "+e2.isEnrolled);
		System.out.println("*******************************");
		

	}
	
}
