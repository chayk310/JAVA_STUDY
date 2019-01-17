package icehs.science.chater10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile [] mobiles = {
			new Galaxy(),
			new IPhone()
		};
		
		mobiles[0].setProduction("Galaxy");
		((Galaxy)(mobiles[0])).setOsVerson("안드로이드 오레오");
		System.out.println( mobiles[0].getProduction() + " : " + ((Galaxy)(mobiles[0])).getOsVerson() );
		mobiles[0].call(5);
		mobiles[0].charge(30);
	
		mobiles[1].setProduction("IPhone");
		((IPhone)(mobiles[1])).setColor("흰색");
		System.out.println( mobiles[1].getProduction() + " : " + ((IPhone)(mobiles[1])).getColor());
		mobiles[1].call(10);
		mobiles[1].charge(15);
	}

}
