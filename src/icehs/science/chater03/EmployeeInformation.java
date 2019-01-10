package icehs.science.chater03;

public class EmployeeInformation {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int enterYear = 2002;
		int year = 2019;
		
		int employeeYear = year - enterYear;
		
		System.out.println("이름 : " + name );
		System.out.println("입사년도 : " + enterYear );
		System.out.println("근무년수 : " + employeeYear );

	}

}
