package icehs.science.chater07;

public class Product {
	String name;
	int price;
	int discount;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void printProductInfo() {
		System.out.println("====== " + this.name + " =======");
		System.out.println("정가 : " + this.price );
		if (this.equals(discount == 0)){
			System.out.println("할인하지 않음");
		}else {
			System.out.println("할인율 : " + this.discount);
		}
	}
}
