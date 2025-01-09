package variables;

public class Student {
	
	String empName;
	int empId;
	char empGen;
	boolean isEnrolled;
	static String batch = "Batch32";
	
	public static void main(String[] args) 
	{
		Student e1 = new Student();
		e1.empName = "shruthi";
		e1.empId = 1001;
		e1.empGen = 'F';
		e1.isEnrolled = true;
		System.out.println("Details of Employee E1");
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.empGen);
		System.out.println(e1.isEnrolled);
		System.out.println(Student.batch);
		System.out.println("*******************************");
		
		Student e2 = new Student();
		e2.empName = "shantosh kumar";
		e2.empId = 1002;
		e2.empGen = 'M';
		e2.isEnrolled = true;
		System.out.println("Details of Employee E2");
		System.out.println(e2.empName);
		System.out.println(e2.empId);
		System.out.println(e2.empGen);
		System.out.println(e2.isEnrolled);
		System.out.println(Student.batch);
		System.out.println("*******************************");
		
		Student e3 = new Student();
		e3.empName = "pallavi";
		e3.empId = 1003;
		e3.empGen = 'F';
		e3.isEnrolled = false;
		System.out.println("Details of Employee E3");
		System.out.println(e3.empName);
		System.out.println(e3.empId);
		System.out.println(e3.empGen);
		System.out.println(e3.isEnrolled);
		System.out.println(Student.batch);
		System.out.println("*******************************");
	}
	
}
