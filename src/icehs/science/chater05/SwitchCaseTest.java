package icehs.science.chater05;

public class SwitchCaseTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50;
		int num5 = 80;
		
		double result = num1 * num2 /2 * 0.6;
		result +=  (num3 + num4) /2 * 0.13;
		result +=  num5 * 0.27;
		
		System.out.println("평가 점수 : " + (int) result );
		
		switch ((int)result /10) {
		case 9 : System.out.println("Special Class입니다.!!"); break;
		case 8 : System.out.println("Gold Class입니다.!!"); break;
		case 7 : System.out.println("Silver Class입니다.!!"); break;
		case 6 : System.out.println("Bronze Class입니다.!!"); break;
		default : System.out.println("Member 입니다.!!"); 
		}

	}

}
