package icehs.science.chater03;

public class StringToInt {

	public static void main(String[] args) {
		String firstNum = "25";
		String second = "20";
		
		int intFirstNum = Integer.parseInt( firstNum );
		int intSecond = Integer.parseInt( second );
		
		System.out.println( firstNum + second );
		System.out.println( intFirstNum + intSecond );
		System.out.println( firstNum + second + intFirstNum + intSecond);
		System.out.println( intFirstNum + intSecond + firstNum + second );
		//숫자로 시작하고 문자열이 나올때까지 숫자 계산
		System.out.println( firstNum + intSecond ); 
		System.out.println( intFirstNum + second ); //숫자로 시작하고 문자열이 나올때까지 숫자 계산
	}

}
