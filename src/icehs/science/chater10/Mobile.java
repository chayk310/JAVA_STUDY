package icehs.science.chater10;

public class Mobile {
	private String production;
	private int price;
	
	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void call(int time) {
		System.out.println(this.production + " : " + time + "분 통화 했습니다.");
	}
	
	public void charge(int time) {
		System.out.println(this.production + " : " + time + "분 충전 했습니다.");
	}
}
