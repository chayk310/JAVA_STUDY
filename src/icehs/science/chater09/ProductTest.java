package icehs.science.chater09;

public class ProductTest {

	public static void main(String[] args) {
		Product washer = new Product("�뵹��",450000,8);
		Television tv = new Television("���׸� tv",3500000,10,"ȭ�� ũ�� 151cm");
		
		washer.printProductInfo();
		System.out.println("==============================");
		tv.printProductInfo();
		System.out.println("��� : " + tv.getDescription());
		System.out.println("[����] �������� ��� 15%�� �����մϴ�");
		washer.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println("�뵹�� �ǸŰ� : " + washer.calculateDiscountPrice());
		System.out.println("���׸� tv �ǸŰ� : " + tv.calculateDiscountPrice());

	}

}
