package icehs.science.chater05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //�Է�
		
		int sum = 0;
		double average = 0;
		
		System.out.print("���� �л����� ? ");
		int studentNum = scanner.nextInt();
		
		for (int i = 1 ; i <= studentNum ; i++) {
			System.out.print( i + "�� ���� : " );
		int score = scanner.nextInt();
		sum += score;
		}
		average = (double) sum / studentNum;
		System.out.println("===============================");
		System.out.println( studentNum + "���� ���� : " + sum + "��");
		System.out.println( studentNum + "���� ��� : " + average + "��");
		
	}

}
