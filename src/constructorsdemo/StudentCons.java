package constructorsdemo;

public class StudentCons {
	
	String studentName;
	int studentId;
	char studentGen;
	boolean isEnrolled;

	public StudentCons(String sName,int sID,char sGen,boolean isEnrolled)
	{
		this.studentName = sName;
		this.studentId = sID;
		this.studentGen = sGen;
		this.isEnrolled = isEnrolled;
		System.out.println("Details of Student");
		System.out.println(studentName+" "+studentId+" "+studentGen+" "+isEnrolled);
		System.out.println("*************************************************");
		
	}
	
	public static void main(String[] args) 
	{
		StudentCons s1 = new StudentCons("shruthi", 1001, 'F', true);
		StudentCons s2 = new StudentCons("pallavi", 1002, 'F', true);
		StudentCons s3 = new StudentCons("jacob", 1003, 'M', true);
		StudentCons s4 = new StudentCons("nancy", 1004, 'F', true);
		
	}
	
}
