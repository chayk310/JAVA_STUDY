package icehs.science.chater09;

public class ProductTest {

	public static void main(String[] args) {
		Product washer = new Product("통돌이",450000,8);
		Television tv = new Television("씨네마 tv",3500000,10,"화면 크기 151cm");
		
		washer.printProductInfo();
		System.out.println("==============================");
		tv.printProductInfo();
		System.out.println("비고 : " + tv.getDescription());
		System.out.println("[공지] 할인율이 모드 15%로 변경합니다");
		washer.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("통돌이 판매가 : " + washer.calculateDiscountPrice());
		System.out.println("씨네마 tv 판매가 : " + tv.calculateDiscountPrice());

	}

}
