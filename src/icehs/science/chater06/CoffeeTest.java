package icehs.science.chater06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Coffee();
		Coffee cafeLatte= new Coffee();
		Coffee makiatto = new Coffee();
		
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		cafeLatte.name = "ī���";
		cafeLatte.price = 4000;
		cafeLatte.printCoffeeInfo();
		
		makiatto.name = "��Ű�ƶ�";
		makiatto.price = 4500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = americano.price + cafeLatte.price + makiatto.price ;
		System.out.println("�� �ݾ�  : " + totalPrice + "��");
		

	}

}
