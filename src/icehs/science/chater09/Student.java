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
		System.out.println("���θ� �մϴ�.");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("�ݺ��� �𿩼� �Ծ��.");
	}

	
}
