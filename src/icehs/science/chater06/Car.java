package icehs.science.chater06;

public class Car {
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
		System.out.println("휘발유 " + amount + "L 주유합니다.");
		oilAmount += amount;
		printCarInfo();
	}
	
	void driveCar( String start, String end, double dist ) {
		System.out.println(start + "에서 " + end + "까지" + dist + "km 주행하였습니다.");
		oilAmount = (int)(oilAmount - dist / 20 );
		distance += dist;
		printCarInfo();
	}
	
	void ableDriveDistance() {
		double ableDist = oilAmount * 20;
		System.out.println("주행 가능한 거리는 약 " + ableDist + "km 입니다.");
	}
	
	void printCarInfo() {
		System.out.println("[ICE 카~] 남은 기름양 : " + oilAmount + "L, 총 주행거리 : " + distance + "km" );
	}
	
}
