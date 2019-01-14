package icehs.science.chater06;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentName = "홍길동";
		student.studentId = "S001";
		student.korean = 94;
		student.english = 80;
		student.math = 89;
		
		student.printStudentInfo();
		
		int avg = student.calculateAverage();
		System.out.println("평균 : " + avg);
		
		
		System.out.println("\n* 학번을 변경합니다 \n");
		
		student.changeStudentId( "STU0001" );
		student.printStudentInfo();

	}

}
