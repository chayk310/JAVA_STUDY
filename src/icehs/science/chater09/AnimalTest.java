package icehs.science.chater09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "�߿���", "�丣�þ�");
		Dog dog= new Dog(2, "�ú����� �㽺Ű", "�����");
		
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
