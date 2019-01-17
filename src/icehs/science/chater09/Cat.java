package icehs.science.chater09;

public class Cat extends Animal {
	
	private String name;
	
	public Cat(int age, String kind, String name) {
		super(age, kind); //super()는 가장 먼저 와야함
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void hunt() {
		System.out.println("쥐를 잡을꺼야");
	}
	
	@Override
	public void play() {
		System.out.println("모빌 놀이가 좋아요");
	}
	
	public void printCatInfo() {
		System.out.println("이름 : " + this.name);
		super.printAnimalInfo();
	}
}
