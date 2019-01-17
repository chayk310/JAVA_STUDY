package icehs.science.chater09;

public class InherTest {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("====== Student ======");
		student.eat();
		student.study();

		System.out.println("====== Teacher ======");
		teacher.eat();
		teacher.teach();
		// teacher.study 자신과 부모의 클래스만 사용 가능
	}

}
