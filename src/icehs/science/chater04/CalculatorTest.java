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
		
		System.out.println("µ¡¼À °á°ú : " + plusResult );
		System.out.println("»¬¼À °á°ú : " + minusResult );
		System.out.println("°ö¼À °á°ú : " + multipleResult );
		System.out.println("³ª´°¼À °á°ú : " + divisionResult );
		System.out.println("³ª¸ÓÁö : " + remainderResult );
	}

}
