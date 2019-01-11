package icehs.science.chater05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumAll = 0;
		int sumOdd = 0; //홀수
		int sumEver = 0; //짝수

		for (int i = 1 ; i <= 1000 ; i++) {
			if ( ( i % 2 ) == 0) {
				sumEver += i;
			}else {
				sumOdd += i;
			}
		}
		
		sumAll = sumEver + sumOdd;
		
		System.out.println("1부터 1000까지의 합 : " + sumAll );
		System.out.println("1부터 1000까지 짝수들의 합 : " + sumEver );
		System.out.println("1부터 1000까지 홀수들의 합 : " + sumOdd );
	}

}
