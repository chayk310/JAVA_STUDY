package icehs.science.chater05;

public class SwapTest {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		
		System.out.println("자리 순서는 " + num1 + " , "  + num2);
		
		int temp = num1; // 임시 변수
		num1 = num2;
		num2 = temp;
		
		System.out.println("자리 순서는 " + num1 +  " , "  + num2);

	}

}
