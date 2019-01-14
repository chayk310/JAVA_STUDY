package icehs.science.chater06;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new Coffee();
		Coffee cafeLatte= new Coffee();
		Coffee makiatto = new Coffee();
		
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		cafeLatte.name = "카페라떼";
		cafeLatte.price = 4000;
		cafeLatte.printCoffeeInfo();
		
		makiatto.name = "마키아또";
		makiatto.price = 4500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = americano.price + cafeLatte.price + makiatto.price ;
		System.out.println("총 금액  : " + totalPrice + "원");
		

	}

}
