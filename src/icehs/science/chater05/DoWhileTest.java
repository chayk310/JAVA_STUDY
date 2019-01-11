package icehs.science.chater05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("점수를 입력하세요 : ");
			score = scanner.nextInt();
		}while(score < 0 || score > 100); // 0~100 외의 숫자를 입력시  do ~ while 문을 벗어남
		
		System.out.println( score );

	}

}
