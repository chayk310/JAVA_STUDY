package icehs.science.chater10;

public class IPhone extends Mobile {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void charge(int time) {
		System.out.println( super.getProduction() + " : " + time + "분 충전 했더니 Full");
	}
}
