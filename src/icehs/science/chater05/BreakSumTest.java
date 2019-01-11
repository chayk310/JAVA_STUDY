package icehs.science.chater05;

public class BreakSumTest {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( int i =1 ; i <= 30 ; i++) {
			sum += i;
			if(sum >= 30) {
				System.out.println("합계 결과 : " + sum);
				break;
			}

	}
	}
}
	
