package icehs.science.chater07;

public class MagazineTest {

	public static void main(String[] args) {
		Magazine mag = new Magazine();
		
	//	mag.price = 2000; ����
		
		mag.setPrcie(2000);
		
		int discountPrice = mag.discountPrice(10);
	}

}
