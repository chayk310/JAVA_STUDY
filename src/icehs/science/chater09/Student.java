package icehs.science.chater09;

public class Student extends Person {
	
	private String department;
	
	public Student() {

	}

	public Student(String name, String phoneNumber, String department) {
		super(name, phoneNumber );
		this.department = department;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("반별로 모여서 먹어요.");
	}

	
}
