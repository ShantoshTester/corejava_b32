package listdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection {

	public static void main(String[] args) {
		
		Student s1 = new Student("bharathi", 1001, 'F');
		Student s2 = new Student("radhika", 1002, 'F');
		Student s3 = new Student("daniel", 1003, 'M');
		Student s4 = new Student("lavanya", 1004, 'F');
		Student s5 = new Student("shantosh", 1005, 'M');
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		for (Student student : studentList) {
			System.out.println(student.sName+" : "+student.sId+" : "+student.sGen);
		}

	}

}
