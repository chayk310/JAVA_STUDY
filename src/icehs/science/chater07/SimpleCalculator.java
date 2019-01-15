package icehs.science.chater07;

public class SimpleCalculator {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		SimpleCalculator.printTitle();
		System.out.println(number1 + " + " +  number2 + " = " + (number1 + number2) );
		SimpleCalculator.printTail();
		
	}
	
	public static void printTitle() {
		System.out.println("========== 계산기 프로그램을 사작합니다. =====");
	}
	
	public static void printTail() {
		System.out.println("============ bye~ bye~ ===============");
	}
}
