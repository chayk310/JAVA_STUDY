package icehs.science.chater05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumMoney = 0;
		
		System.out.print("모임이 몇 차까지 진행되었나요? : ");
		int meetingNumber = scanner.nextInt();
		System.out.println("====================================");
		
		System.out.println("각 차수에서 쓴 비용을 입력하세요.");
		for (int i = 1 ; i <= meetingNumber ; i++ ) {
			System.out.print( i + "차 비용 : ");
			int money = scanner.nextInt();
			sumMoney += money;
		}
		System.out.println("총 비용은 " + sumMoney + "원 입니다.");
		System.out.println("====================================");
		
		System.out.print("모임의 인원수를 입력하세요 :");
		int member = scanner.nextInt();
		System.out.println("====================================");
		System.out.println("더치페이 금액은?");
		int dutchMoney = sumMoney / member;
		for (int i = 1 ;  i <= member ; i++ ) {
			if ( i  != member) {
				System.out.println(i + " : " + dutchMoney);
				sumMoney -= dutchMoney;
			}else {
				System.out.println(i + " : " + sumMoney);
			}

		}


	}

}
