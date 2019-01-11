package icehs.science.chater05;

public class SwitchEx {
	public static void main(String[] args) {
		int x = 55 ;
		
		switch ( x ) {
		case 0 : System.out.println("0을 입력했습니다."); break; //break를 넣지 않으면 case가 실행된 줄부터 전체 실행
		case 1 : System.out.println("1을 입력했습니다."); break; //break를 사용하면 바로 빠져나감
		case 2 : System.out.println("2를 입력했습니다."); break;
		case 3 : System.out.println("3을 입력했습니다."); break;
		case 4 : System.out.println("4를 입력했습니다."); break;
		case 5 : System.out.println("5를 입력했습니다."); break;
		case 6 : System.out.println("6을 입력했습니다."); break;
		case 7 : System.out.println("7을 입력했습니다."); break;
		case 8 : System.out.println("8을 입력했습니다."); break;
		case 9 : System.out.println("9를 입력했습니다."); break;
		default : System.out.println("0~9를 벗어난 수를 입력했습니다."); // 마지막 문장은 break를 쓸 필요없음
		}
	}
}
