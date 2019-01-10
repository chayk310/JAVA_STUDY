package icehs.science.chater03;

public class StringTesy {
	public static void main(String[] args) {
		String name = "¼¼Á¾´ë¿Õ";
		int year = 2019;
		String money = "10000";
		int intMoney = Integer.parseInt( money );
		
		System.out.println( name + " : " + money);
		System.out.println( year + "³â");
		System.out.println( money + year );
		System.out.println( intMoney + year );
	}
}
