package icehs.science.chater03;

public class StudentScore {
	public static void main(String[] args) {
		double mathScore = 94.7;
		double englishScore = 83.2;
		double koreanScore = 87.1;
		
		int intMathScore = (int)mathScore;
		int intEnglishScore = (int)englishScore;
		int intKoreanScore = (int)koreanScore;
		
		System.out.println("수학 : " + intMathScore );
		System.out.println("영어 : " + intEnglishScore );
		System.out.println("국어 : " + intKoreanScore );
	}
}
