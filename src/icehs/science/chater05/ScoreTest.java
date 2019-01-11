package icehs.science.chater05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력
		
		int sum = 0;
		double average = 0;
		
		System.out.print("반의 학생수는 ? ");
		int studentNum = scanner.nextInt();
		
		for (int i = 1 ; i <= studentNum ; i++) {
			System.out.print( i + "번 점수 : " );
		int score = scanner.nextInt();
		sum += score;
		}
		average = (double) sum / studentNum;
		System.out.println("===============================");
		System.out.println( studentNum + "명의 총점 : " + sum + "점");
		System.out.println( studentNum + "명의 평균 : " + average + "점");
		
	}

}
