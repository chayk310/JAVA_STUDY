package icehs.science.chater05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		int num5 = 23;
		int num6 = 96;
		
		int result1 = num1 * num2;
		System.out.print( num1 + " * " + num2 + " : "); // println�� print�� \n�� ���Ѱ�
		if ( result1 >= 100) {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}else if ( result1 >= 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else if ( result1 >= 0) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		
		int result2 = num3 * num4;
		System.out.print( num3 + " * " + num4 + " : "); // println�� print�� \n�� ���Ѱ�
		if ( result2 >= 100) {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}else if ( result2 >= 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else if ( result2 >= 0) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		
		int result3 = num5 * num6;
		System.out.print( num5 + " * " + num6 + " : "); // println�� print�� \n�� ���Ѱ�
		if ( result3 >= 100) {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}else if ( result3 >= 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else if ( result3 >= 0) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		
		int result4 = num3 * (-1) * num2;
		System.out.print( num1 + " * -" + num2 + " : "); // println�� print�� \n�� ���Ѱ�
		if ( result4 >= 100) {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
		}else if ( result4 >= 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else if ( result4 >= 0) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}

	}

}
