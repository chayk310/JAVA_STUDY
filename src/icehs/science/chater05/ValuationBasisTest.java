package icehs.science.chater05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50;
		int num5 = 80;
		
		double result = num1 * num2 /2 * 0.6;
		result +=  (num3 + num4) /2 * 0.13;
		result +=  num5 * 0.27;
		
		System.out.println("평가 점수 : " + result );
		
		if ( result >= 95 && result < 100) {
			System.out.println("Special Class 입니다!!");
		}else if( result >=90 && result < 95){
			System.out.println("Gold Class 입니다!!");
		}else if( result >=85 && result < 90){
			System.out.println("Silver Class 입니다!!");
		}else if( result >=80 && result < 85){
			System.out.println("Bronze Class 입니다!!");
		}else if ( result < 80) {
			System.out.println("Member 입니다.!!");
		}else {
			System.out.println("입력한 값이 잘못되었습니다. 다시 입력하세요."); // 입력값이 100점이상이 나올때 실행 
		}

	}

}
