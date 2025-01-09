package variables;

public class Employee {
	
	String empName;
	int empId;
	char empGen;
	boolean isEmpActive;
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.empName = "shruthi";
		e1.empId = 1001;
		e1.empGen = 'F';
		e1.isEmpActive = true;
		System.out.println("Details of Employee E1");
		System.out.println(e1.empName);
		System.out.println(e1.empId);
		System.out.println(e1.empGen);
		System.out.println(e1.isEmpActive);
		System.out.println("*******************************");
		
		Employee e2 = new Employee();
		e2.empName = "shantosh kumar";
		e2.empId = 1002;
		e2.empGen = 'M';
		e2.isEmpActive = true;
		System.out.println("Details of Employee E2");
		System.out.println(e2.empName);
		System.out.println(e2.empId);
		System.out.println(e2.empGen);
		System.out.println(e2.isEmpActive);
		System.out.println("*******************************");
		
		Employee e3 = new Employee();
		e3.empName = "pallavi";
		e3.empId = 1003;
		e3.empGen = 'F';
		e3.isEmpActive = false;
		System.out.println("Details of Employee E3");
		System.out.println(e3.empName);
		System.out.println(e3.empId);
		System.out.println(e3.empGen);
		System.out.println(e3.isEmpActive);
		System.out.println("*******************************");
	}
	
}
