package icehs.science.chater08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] scores = { 93, 87, 90};
		String[] subjects = {"국어", "영어", "수학"};
		int sum = 0;
		double average = 0;
		
		for ( int i = 0 ; i < scores.length ; i++ ) {
			System.out.println( subjects[i] + " : " + scores[i] );
			sum += scores[i];
		}
		
		average =(double) sum / scores.length;
		
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + average );
		
		/*
		 * System.out.println("국어 : " + scores[0] ); System.out.println("영어 : " +
		 * scores[1] ); System.out.println("수학 : " + scores[2] );
		 * System.out.println("평균 : " + average );
		 */
		
		int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println(numbers[5]);
		
		String [] names = { "홍길동", "홍길순", "전우치"};
		System.out.println( names[1] );
	}

}
