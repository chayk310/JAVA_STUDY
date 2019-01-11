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
		System.out.print( num1 + " * " + num2 + " : "); // println는 print에 \n를 더한것
		if ( result1 >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if ( result1 >= 10) {
			System.out.println("두 자리 수입니다.");
		}else if ( result1 >= 0) {
			System.out.println("한 자리 수입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		
		int result2 = num3 * num4;
		System.out.print( num3 + " * " + num4 + " : "); // println는 print에 \n를 더한것
		if ( result2 >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if ( result2 >= 10) {
			System.out.println("두 자리 수입니다.");
		}else if ( result2 >= 0) {
			System.out.println("한 자리 수입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		
		int result3 = num5 * num6;
		System.out.print( num5 + " * " + num6 + " : "); // println는 print에 \n를 더한것
		if ( result3 >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if ( result3 >= 10) {
			System.out.println("두 자리 수입니다.");
		}else if ( result3 >= 0) {
			System.out.println("한 자리 수입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		
		int result4 = num3 * (-1) * num2;
		System.out.print( num1 + " * -" + num2 + " : "); // println는 print에 \n를 더한것
		if ( result4 >= 100) {
			System.out.println("세 자리 수 이상입니다.");
		}else if ( result4 >= 10) {
			System.out.println("두 자리 수입니다.");
		}else if ( result4 >= 0) {
			System.out.println("한 자리 수입니다.");
		}else {
			System.out.println("음수는 확인하지 않습니다.");
		}

	}

}
