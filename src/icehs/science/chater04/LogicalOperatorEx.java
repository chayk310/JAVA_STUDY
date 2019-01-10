package icehs.science.chater04;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		boolean result1 = ( num1 > num2 ) && ( num1 > 5 );
		boolean result2 = ( num1 > num2 ) && ( num1 == num2 );
		//boolean result2 = !( num1 > num2 ) && ( ++num1 == num2 );
		// ++가 출력되지 않는 이유: 앞에서 false가 나와서 뒤의 계산을 하지 않음
		boolean result3 = ( num1 <= num2 ) || ( num1 != num2 );
		boolean result4 = ( num1 <= num2 ) || !( num1 > num2 );
		
		System.out.println( result1 );
		System.out.println( result2 );
		System.out.println( result3 );
		System.out.println( result4 );
		System.out.println( !result4 );
		
		
	}

}
