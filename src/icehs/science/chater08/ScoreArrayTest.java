package icehs.science.chater08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] scores = { 93, 87, 90};
		String[] subjects = {"����", "����", "����"};
		int sum = 0;
		double average = 0;
		
		for ( int i = 0 ; i < scores.length ; i++ ) {
			System.out.println( subjects[i] + " : " + scores[i] );
			sum += scores[i];
		}
		
		average =(double) sum / scores.length;
		
		System.out.println("���� : " + sum );
		System.out.println("��� : " + average );
		
		/*
		 * System.out.println("���� : " + scores[0] ); System.out.println("���� : " +
		 * scores[1] ); System.out.println("���� : " + scores[2] );
		 * System.out.println("��� : " + average );
		 */
		
		int [] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println(numbers[5]);
		
		String [] names = { "ȫ�浿", "ȫ���", "����ġ"};
		System.out.println( names[1] );
	}

}
