package icehs.science.chater05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 92;
		
		if (score >= 90) {
			System.out.println("A���� �Դϴ�.");
		}else if(score >= 80){
			System.out.println("B���� �Դϴ�.");
		}else if(score >= 70){
			System.out.println("C���� �Դϴ�.");
		}else if(score >= 60){
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}

	}

}