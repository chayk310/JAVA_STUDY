package icehs.science.chater04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		
		System.out.println("¦���Դϱ�? : " + ( num % 2 == 0));
		System.out.println("3�� ����Դϱ�? : " + ( num % 3 == 0));
		
		boolean result1 = ( num % 2 == 0 ) && ( num % 7 == 0);
		boolean result2 = ( num % 2 == 0 ) || ( num % 7 == 0);
		
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + result1 );
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + result2 );

	}

}
