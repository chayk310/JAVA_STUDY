package icehs.science.chater04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		
		int plusResult = num1 + num2;
		int minusResult = num1 - num2;
		int multipleResult = num1 * num2;
		int divisionResult = num1 / num2;
		int remainderResult = num1 % num2;
		
		System.out.println("���� ��� : " + plusResult );
		System.out.println("���� ��� : " + minusResult );
		System.out.println("���� ��� : " + multipleResult );
		System.out.println("������ ��� : " + divisionResult );
		System.out.println("������ : " + remainderResult );
	}

}
