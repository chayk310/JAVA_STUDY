package icehs.science.chater05;

public class SwapTest {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		
		System.out.println("�ڸ� ������ " + num1 + " , "  + num2);
		
		int temp = num1; // �ӽ� ����
		num1 = num2;
		num2 = temp;
		
		System.out.println("�ڸ� ������ " + num1 +  " , "  + num2);

	}

}
