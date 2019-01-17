package icehs.science.chater09;

public class Dentist extends Doctor {
	
	public Dentist(String name) {
		super(name, "치과");
	}
	
	public void pullOutTeeth(){
		System.out.println("이를 뽑습니다.");
	}
}
