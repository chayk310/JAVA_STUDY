package icehs.science.chater05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumMoney = 0;
		
		System.out.print("������ �� ������ ����Ǿ�����? : ");
		int meetingNumber = scanner.nextInt();
		System.out.println("====================================");
		
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for (int i = 1 ; i <= meetingNumber ; i++ ) {
			System.out.print( i + "�� ��� : ");
			int money = scanner.nextInt();
			sumMoney += money;
		}
		System.out.println("�� ����� " + sumMoney + "�� �Դϴ�.");
		System.out.println("====================================");
		
		System.out.print("������ �ο����� �Է��ϼ��� :");
		int member = scanner.nextInt();
		System.out.println("====================================");
		System.out.println("��ġ���� �ݾ���?");
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
