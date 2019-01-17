package icehs.science.chater09;

public class HumanTest {

	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println("======== Person =======");
		person.eat();
		
		System.out.println("======== Student =======");
		student.eat();
		
		System.out.println("======== Teacher =======");
		teacher.eat();
	}

}
