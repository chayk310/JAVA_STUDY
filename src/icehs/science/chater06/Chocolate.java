package icehs.science.chater06;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	int calculateTotalPrice( int count ) {
		return count * price ;
	}
	
	int calculateTotalPrice( int count , int discount ) {
		int resultPrice = price * (100 - discount) / 100*count;
		return resultPrice;
	}
	
	void changeChocolateInfo( String newName, int newPrice ) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	
	void changeChocolateInfo( String newName, String newType, int newPrice ) {
		name = newName;
		type = newType;
		price = newPrice;
		printChocolateInfo();
	}
	
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " + type + ", 가격 : " + price );
	}
	
}
