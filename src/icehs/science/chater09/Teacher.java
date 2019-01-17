package icehs.science.chater09;

public class Teacher extends Person {
	
	private String subject;
	
	public Teacher() {

	}

	public Teacher(String name , String phoneNumber, String subject ) {
		super(name, phoneNumber );
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("강의를 합니다.");
	}

	@Override //해당 메소드가 부모 클래스의 메소드를 오버라이딩 한 메소드라는 것을 의미
	public void eat() {
		super.eat();	
		System.out.println("혼밥해요.");
	}
	
}
