package icehs.science.chater06;

public class Student {
	
	String studentName;
	String studentId;
	int korean;
	int english;
	int math;
	
	public int calculateAverage() {
		int average = (korean + english + math)/ 3;
		return average;
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : " + studentName);
		System.out.println("학번 : " + studentId);
		System.out.println("국어 성적 " + korean );
		System.out.println("영어 성적 " + english );
		System.out.println("수학 성적 " + math );
	}
	
	public void changeStudentId(String newId) {
		studentId = newId;
	}
	
}
