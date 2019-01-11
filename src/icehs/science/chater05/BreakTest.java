package icehs.science.chater05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			System.out.println("더할 숫자를 입력하세요.  0을 입력하면 종료");
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			}else {
				sum += num;
			}
		}
		System.out.println("합계 : " + sum);
	}

}
