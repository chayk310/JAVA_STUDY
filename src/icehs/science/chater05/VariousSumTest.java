package icehs.science.chater05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumAll = 0;
		int sumOdd = 0; //Ȧ��
		int sumEver = 0; //¦��

		for (int i = 1 ; i <= 1000 ; i++) {
			if ( ( i % 2 ) == 0) {
				sumEver += i;
			}else {
				sumOdd += i;
			}
		}
		
		sumAll = sumEver + sumOdd;
		
		System.out.println("1���� 1000������ �� : " + sumAll );
		System.out.println("1���� 1000���� ¦������ �� : " + sumEver );
		System.out.println("1���� 1000���� Ȧ������ �� : " + sumOdd );
	}

}
