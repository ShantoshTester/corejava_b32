package arraysdemo;

public class StudentObject {

	public static void main(String[] args) {
		
		Object student[] = new Object[5];
		student[0] = "Shantosh";
		student[1] = 123456;
		student[2] = 'M';
		student[3] = 899.99;
		student[4] = true;
		
		for(Object studentDetails : student)
		{
			System.out.print(studentDetails+" ");
		}

	}

}
