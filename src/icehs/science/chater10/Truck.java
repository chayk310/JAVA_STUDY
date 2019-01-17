package icehs.science.chater10;

public class Truck extends Car {
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("트럭를 타고 " + distance + "km 이동합니다.");
		System.out.println("연료 : " + super.getOilSize());
	}
	
}
