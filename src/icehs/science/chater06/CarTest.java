package icehs.science.chater06;

public class CarTest {

	public static void main(String[] args) {
		Car iceCar = new Car();
		
		iceCar.oilAmount = 5;
		iceCar.distance = 140.0;
		
		iceCar.printCarInfo();
		
		iceCar.addOil( 10 );
		
		iceCar.driveCar( "IT센터", "인천공항", 10.17 );
		
		iceCar.driveCar( "인천공항", "곤지암리조트", 60.21 );
		
		iceCar.ableDriveDistance();

	}

}
