package icehs.science.chater06;

public class BuildingTest {

	public static void main(String[] args) {
		// stack lifo (lost in frist out) ex) ctrl + z , 인터넷 방문기록 - 가장 최근의 것을 실행
		// int long double
		
		// heap fifo (frist in frist out) ex)인쇄
		// 객체
		Building building1 = new Building(); //클래스명 변수명 = new 클래스명();
		
		building1.name = "국제선타워";
		building1.address = "김포동";
		building1.totalFloor = 5;
		
		System.out.println("건물명 : " + building1.name );
		System.out.println("주소 : " + building1.address );
		System.out.println("전체 층 수 : " + building1.totalFloor );
		
		building1.moveElevator();
		building1.changeAddress( "비행로" );
		
		System.out.println("새 주소 : " + building1.address);
		
	}

}
