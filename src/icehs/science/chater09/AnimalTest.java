package icehs.science.chater09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "具克捞", "其福矫救");
		Dog dog= new Dog(2, "矫海府救 倾胶虐", "大大捞");
		
		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		dog.printDogInfo();
		dog.run();
		dog.hunt();
		dog.play();
	}

}
