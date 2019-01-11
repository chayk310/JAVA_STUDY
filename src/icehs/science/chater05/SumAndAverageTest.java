package icehs.science.chater05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		for ( int i = 1 ; i <= 500 ; i++) {
			sum += i;
		}
		
		average = (double)sum / 500; // int / int 는 int 이므로 double로 캐스팅을 한다
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average );
	}

}
