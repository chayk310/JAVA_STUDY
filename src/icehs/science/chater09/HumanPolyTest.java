package icehs.science.chater09;

public class HumanPolyTest {

	public static void main(String[] args) {
		Person [] persons = {
				new Person(),
				new Student(),
				new Teacher()
		};
		
//		persons[1].study(); 에러
//		persons[3].teacher(); 에러
		
//		((Student)(persons[1])).study();
//		((Teacher)persons[2]).teach();
//		System.out.println();
		
		for ( int i = 0 ; i < persons.length ; i++) {
			if(persons[i] instanceof Student) {
				((Student)(persons[i])).study();
			}else if(persons[i] instanceof Teacher) {
				((Teacher)(persons[i])).teach();
			}
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
	}

}
