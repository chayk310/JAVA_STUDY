package icehs.science.chater05;

public class ForIfEx {

	public static void main(String[] args) {
		// 횟수를 알고 있을 때 for ex) a를 30회 실행
		// 알 수 없을 때 while ex) a의 값이 30이 될 때까지 실행
		
		for (int inx = 1 ; inx <= 10 ; inx++ ) {
			if ( ( inx%2 ) == 0) {
			System.out.println(inx);
			}
		}
	}

}
