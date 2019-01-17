package icehs.science.chater10;

public class Car {
	private int OilSize;
	
	public int getOilSize() {
		return OilSize;
	}

	public void setOilSize(int oilSize) {
		OilSize = oilSize;
	}

	public void go(int distance) {
		System.out.println( distance + "km 이동합니다.");
	}
}
