package icehs.science.chater06;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentName = "ȫ�浿";
		student.studentId = "S001";
		student.korean = 94;
		student.english = 80;
		student.math = 89;
		
		student.printStudentInfo();
		
		int avg = student.calculateAverage();
		System.out.println("��� : " + avg);
		
		
		System.out.println("\n* �й��� �����մϴ� \n");
		
		student.changeStudentId( "STU0001" );
		student.printStudentInfo();

	}

}
