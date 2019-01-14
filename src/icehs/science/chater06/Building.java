package icehs.science.chater06;

public class Building {
	
	String name;
	String address;
	int totalFloor;
	// 속성(맴버 변수) 초기값을 줘도 안줘도 됨
	
	public void moveElevator(){
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	public void changeAddress( String newAddress ) {
		address = newAddress;
	} // 동작 (메소드)
	
}
