package icehs.science.chater06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		
		iceCar.oilAmount = 5;
		iceCar.distance = 140.0;
		
		iceCar.printCarInfo();
		
		iceCar.addOil( 10 );
		
		iceCar.driveCar( "IT����", "��õ����", 10.17 );
		
		iceCar.driveCar( "��õ����", "�����ϸ���Ʈ", 60.21 );
		
		iceCar.ableDriveDistance();

	}

}
